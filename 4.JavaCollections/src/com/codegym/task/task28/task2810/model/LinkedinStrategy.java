package com.codegym.task.task28.task2810.model;

import com.codegym.task.task28.task2810.vo.JobPosting;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LinkedinStrategy implements Strategy {


    private static final String URL_FORMAT = "https://www.linkedin.com/jobs/search?keywords=Java+%s&start=%d";

    String url = String.format(URL_FORMAT, "San+Francisco", 75);





    @Override
    public List<JobPosting> getJobPostings(String searchString) {
        List<JobPosting> jobPostings = new ArrayList<>();
        int pageNum = 0;
        Document doc = null;
        while(true)
        {
            try {
                doc = getDocument(searchString, pageNum);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Elements jobs = doc.getElementsByClass("jobs-search-result-item");
            if (jobs.size()==0) break;
            for (Element element: jobs  )
            {
                if (element != null)
                {
                   JobPosting jobPosting = new JobPosting();
                    jobPosting.setTitle(element.getElementsByAttributeValueContaining("class", "title").text());
                    jobPosting.setCompanyName(element.getElementsByAttributeValueContaining("class", "company_name").text());
                    jobPosting.setWebsiteName(URL_FORMAT);
                    //jobPosting.setUrl("https://linkedin.com" + element.select("a[class=job_icon]").attr("href"));
                    jobPosting.setUrl(element.getElementsByAttributeValueContaining("class", "title").attr("href"));
                    //String salary = element.getElementsByAttributeValue("class", "salary").text();
                    String city = element.getElementsByAttributeValueContaining("class", "location").text();
                    //jobPosting.setSalary(salary.length()==0 ? "" : salary);
                    jobPosting.setCity(city.length()==0 ? "" : city);
                    jobPostings.add(jobPosting);

                }
            }
            pageNum++;
        }
        return jobPostings;
    }


    protected Document getDocument(String searchString, int page) throws IOException{
        Document doc = null;
        try {
            doc = Jsoup.connect(String.format(URL_FORMAT, searchString, page))
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0")
                    .referrer("")
                    .get();
            String s = doc.html();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

}

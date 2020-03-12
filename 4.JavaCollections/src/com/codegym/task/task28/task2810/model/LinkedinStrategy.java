package com.codegym.task.task28.task2810.model;

import com.codegym.task.task28.task2810.vo.JobPosting;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedinStrategy implements Strategy {


    private static final String URL_FORMAT = "https://www.linkedin.com/jobs/search?keywords=Java+%s&start=%d";

    String url = String.format(URL_FORMAT, "San+Francisco", 75);


    @Override
    public List<JobPosting> getJobPostings(String searchString) {
        org.jsoup.nodes.Document doc = null;

        try {
            doc = Jsoup.connect("https://www.linkedin.com/jobs/search?keywords=Java+%s&start=%d").get();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return Collections.EMPTY_LIST;
    }
}

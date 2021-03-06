package com.codegym.task.task28.task2810;


import com.codegym.task.task28.task2810.model.Provider;
import com.codegym.task.task28.task2810.vo.JobPosting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {


    private Provider[] providers;

    public Controller(Provider... providers) {
        if(providers.length==0){
            throw new IllegalArgumentException();
        }

        this.providers = providers;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "providers=" + Arrays.toString(providers) +
                '}';
    }

    public void scan() {
        List<JobPosting> allJobPosting = new ArrayList<>();
        for(Provider provider : providers){
            allJobPosting.addAll(provider.getJavaJobPostings("San+Francisco"));

        }System.out.println(allJobPosting.size());
    }
}
package com.dao;


import com.po.Job0432;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class JobDao0432Test {
    public static void main(String[] args) {
        Job0432 job0432=new Job0432();
        JobDao0432 jobDao0432 = new JobDao0432();
        job0432.setJname("c++");
        System.out.println(jobDao0432.insertName(job0432));

    }

}
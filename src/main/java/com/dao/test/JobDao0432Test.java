package com.dao.test;


import com.dao.jobDao.JobDao0432;
import com.po.Job0432;

class JobDao0432Test {
    public static void main(String[] args) {
        Job0432 job0432=new Job0432();
        JobDao0432 jobDao0432 = new JobDao0432();
        job0432.setJname("c++");
        job0432.setEID(7);
        System.out.println(jobDao0432.updateInformationByname(job0432));
    }

}
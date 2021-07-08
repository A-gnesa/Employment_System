package com.dao.jobDao;

import com.po.Job0432;

import java.util.List;

public interface JobDaol0432 {
    List<Job0432> findAll();
    boolean insertName(Job0432 jname);
    boolean deleteInformationByName(Job0432 jname);
    int updateInformationByname(Job0432 job0432);
    Job0432 findJobByJName(Job0432 j);
}


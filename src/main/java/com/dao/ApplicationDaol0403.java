package com.dao;

import com.po.Application0403;
import com.po.User;

import java.util.List;

public interface ApplicationDaol0403 {
    boolean deleteByUID(User user);
    List<Application0403> selectApplicationByTime();
}

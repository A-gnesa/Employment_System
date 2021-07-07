package com.dao.applicationDao;

import com.po.Application0403;
import com.po.Recruit0430;
import com.po.User;

import java.util.List;

public interface ApplicationDaol0403 {
    boolean deleteByUID(User user);
    List<Application0403> selectApplicationByTime();
    boolean add(Application0403 application0403);
    List<Application0403> findALLapplication();
}

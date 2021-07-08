package com.dao.applicationDao;

import com.po.Application0403;
import com.po.Recruit0430;
import com.po.User;

import java.util.List;

public interface ApplicationDaol0403 {
    boolean deleteByUID(User user);
    List<Application0403> selectApplicationByTime();
    boolean insertApplicationByUIDANDPID(User u , Recruit0430 r);
    List<Application0403> findApplicationByUID(User u);
    boolean deleteByRID(Integer rid);
}

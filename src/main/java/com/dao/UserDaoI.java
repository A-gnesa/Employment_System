package com.dao;

import com.po.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDaoI {
    List<User> findALLUser();
}

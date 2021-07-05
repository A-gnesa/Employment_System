package com.dao.userDao;

import com.dao.baseDao;
import com.po.User;

import java.util.List;

public  class UserDao extends baseDao implements UserDaoI{
    @Override
    public List<User> findALLUser() {
        session = factory.openSession();
        return session.selectList("findAllUser");
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }
}

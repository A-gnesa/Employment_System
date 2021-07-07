package com.dao.userDao;

import com.dao.baseDao;
import com.po.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("UserDao")
public  class UserDao extends baseDao implements UserDaoI{
    @Override
    public List<User> findALLUser() {
        session = factory.openSession();
        return session.selectList("findAllUser");
    }

    @Override
    public boolean addUser(User user) {
        session = factory.openSession();
        int i =session.insert("addUser",user);
        session.commit();
        return i>0;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public User selectUserByUID(User user) {
        return null;
    }

    @Override
    public User findUserByAccountNumber(String username) {
        session = factory.openSession();
        return session.selectOne("findUserByAccountNumber",username);
    }

}

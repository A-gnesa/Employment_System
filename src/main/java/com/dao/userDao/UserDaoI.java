package com.dao.userDao;

import com.po.PersonalInformation0308;
import com.po.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDaoI {
    List<User> findALLUser();
    boolean addUser(User user);
    boolean updateUser(User user);
//    User selectUserByUID(User user);
    User findUserByAccountNumber(String username);

}

package com.dao;

import com.po.PersonalCenter0308;
import com.po.Recruit0430;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PersonalCenterDaoI0308 {
    List<PersonalCenter0308> findPersonalCenterByUID(PersonalCenter0308 PersonalCenter0308);
    boolean addContact_information(PersonalCenter0308 PersonalCenter0308);
    boolean addCenterByCollege(PersonalCenter0308 PersonalCenter0308);
    boolean addPersonalCenterByUser_sex(PersonalCenter0308 PersonalCenter0308);
    boolean addPersonalCenterByUser_name(PersonalCenter0308 PersonalCenter0308);
    boolean addPersonalCenterByUser_age(PersonalCenter0308 PersonalCenter0308);
}

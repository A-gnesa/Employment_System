package com.dao;

import com.po.Recruit0430;

import java.util.List;

public interface RecruitlDao0430 {
    List<Recruit0430> findRecruitBycity(Recruit0430 recruit0430);//根据城市查询
    List<Recruit0430> findRecruitByEID(Recruit0430 recruit0430);//根据职业表主键查询
    List<Recruit0430> findRecruitByrequirement(Recruit0430 recruit0430);//根据要求模糊查询
    List<Recruit0430> findALLRecruit();//查询所有
    boolean delete(Recruit0430 recruit0430);//删除根据PID
    List<Recruit0430> findRecruitBytime();//根据时间从近到远查询
    boolean add(Recruit0430 recruit0430);//添加
}

package com.dao;


import com.po.Recruit0430;

class RecruitDao0430Test {
    public static void main(String[] args) {
        RecruitDao0430 recruitDao0430 = new RecruitDao0430();
        Recruit0430 recruit = new Recruit0430();
        recruit.setCity("深圳");
        System.out.println(recruitDao0430.findALLRecruit());
        System.out.println(recruitDao0430.findRecruitBycity(recruit));

    }
}

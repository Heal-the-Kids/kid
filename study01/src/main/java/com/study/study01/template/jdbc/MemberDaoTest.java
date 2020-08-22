package com.study.study01.template.jdbc;

import com.study.study01.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}

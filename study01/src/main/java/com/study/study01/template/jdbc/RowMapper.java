package com.study.study01.template.jdbc;

import java.sql.ResultSet;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}

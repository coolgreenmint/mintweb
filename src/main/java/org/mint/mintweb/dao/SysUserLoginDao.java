package org.mint.mintweb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: SysUserLoginDao
 * @Description: 登录用户Dao
 * @author: mint
 * @date: 2021/9/17 14:52
 */
@Repository
public class SysUserLoginDao {

    //模拟数据库
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> getAllUser() {
        String sql = "select * from student";
        return jdbcTemplate.queryForList(sql);
    }

}

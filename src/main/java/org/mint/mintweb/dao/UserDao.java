package org.mint.mintweb.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mint.mintweb.pojo.Student;
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
@Mapper
@Repository
public interface UserDao {

    /**
     * 查询所有的学生信息
     *
     * @return
     */
    public List<Student> queryAllStudents();

    /**
     * 删除特定的学生信息
     *
     * @param id 学生编号
     * @return 返回受影响的行数
     */
    public int deleteStudent(int id);

}

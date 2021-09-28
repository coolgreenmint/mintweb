package org.mint.mintweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @ClassName: SysUser
 * @Description: 用户信息表
 * @author: mint
 * @date: 2021/9/17 14:42
 */
//数据类
@Data
//所有有参数构造函数
@AllArgsConstructor
//无参构造函数
@NoArgsConstructor
public class SysUserLogin {
    private Integer id;
    private Integer stuage;
    private String username;
    private String stuclass;
    private Date adddate;
    private Timestamp addtime;
    private Timestamp addtimes;
}

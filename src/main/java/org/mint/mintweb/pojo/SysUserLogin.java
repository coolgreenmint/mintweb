package org.mint.mintweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String uuid;
    private String userName;
    private String userPwd;
    private String lastLoginIP;
    private Timestamp lastLoginTime;
}

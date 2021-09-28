package org.mint.mintweb.controller.login;

import org.mint.mintweb.config.webinfo.WebInfoConfig;
import org.mint.mintweb.dao.UserDao;
import org.mint.mintweb.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: LoginController
 * @Description： 用户登录控制器
 * @author: mint
 * @date: 2021/9/18 10:22
 */
@Controller
public class LoginController {

    @Autowired
    private WebInfoConfig webInfo;

    @Autowired
    private UserDao userDao;

    @GetMapping("/")
    public String getLogin(Model model) {
        //封装信息到前台
        model.addAttribute("year", webInfo.getYear());
        model.addAttribute("company", webInfo.getCompany());

        return "login";
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value = "username", required = false) String userName,
                        @RequestParam(value = "password", required = false) String userPwd,
                        Model model) {
        if ("123456".equals(userPwd)) {
            //封装信息到前台
            model.addAttribute("year", webInfo.getYear());
            model.addAttribute("company", webInfo.getCompany());

            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "用户名或密码错误！");
            return "login";
        }
    }

    @RequestMapping("/getUsers")
    @ResponseBody
    public List<Student> queryAllStudents() {
        return userDao.queryAllStudents();
    }
}

package org.mint.mintweb.controller.login;

import org.mint.mintweb.config.webinfo.WebInfoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/")
    public String getLogin(Model model) {
        //封装信息到前台
        model.addAttribute("year", webInfo.getYear());
        model.addAttribute("company", webInfo.getCompany());

        return "login";
    }

}

package org.mint.mintweb.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: IndexController
 * @Description: 首页controller
 * @author: mint
 * @date: 2021/9/22 16:22
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String getIndex() {
        return "index";
    }

}

package org.mint.mintweb.config.mvc;

import org.apache.catalina.util.ParameterMap;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Locale;

/**
 * @ClassName: MyLocalResolver
 * @Description: 自定义视图解析器
 * @author: mint
 * @date: 2021/9/22 10:53
 */
public class MyLocalResolver implements LocaleResolver {

    //定义解析语言
    private static final String ZH_CN = "zh_CN";
    private static final String EN_US = "en_US";

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String param = request.getParameter("language");
        Locale locale = Locale.getDefault();
        if (!StringUtils.isEmpty(param) && !"null".equals(param)) {
            String[] info = param.split("_");
            locale = new Locale(info[0], info[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
package org.mint.mintweb.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: LoginInterceptor
 * @Description: 登录拦截器
 * @author: mint
 * @date: 2021/9/22 15:31
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("user");

        if (loginUser == null) {
            request.setAttribute("msg", "请先登录");
            request.getRequestDispatcher("/").forward(request, response);
            return false;
        }
        return true;
    }
}

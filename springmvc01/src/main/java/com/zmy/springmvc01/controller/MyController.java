package com.zmy.springmvc01.controller;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: MengyaoZeng
 * @Telephone: 18573903136
 * @Email: 343722243@qq.com
 * @Description:
 * @Date: Created in 15:17 2022/1/22
 */
public class MyController implements Controller {

    /**
     * 这个方法用来处理请求
     * @param request 这个就是前端发送来的请求
     * @param response 这个就是服务端给前端的响应
     * @return 返回ModelAndView，Model就相当于我们的数据模型，View则是视图
     * @throws Exception
     */
    @Nullable
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("name", "zmy");
        return mv;
    }
}

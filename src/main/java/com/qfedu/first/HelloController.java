package com.qfedu.first;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloController implements Controller {

    //返回值允许为空

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        //设置要跳转到的资源的名称
        //modelAndView.setViewName("/index.jsp");
        //在视图解析器中配置前缀和后缀情况下，直接设置文件名
        modelAndView.setViewName("index");
        //设置数据
        modelAndView.addObject("name","zhangsan");

        return modelAndView;
    }
}

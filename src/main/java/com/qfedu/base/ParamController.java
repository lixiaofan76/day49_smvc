package com.qfedu.base;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class ParamController {

    @RequestMapping("/param1.do")
    public String param1(HttpServletRequest request){
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println(name);
        System.out.println(age);
        return "index";
    }

    //方法的参数名和前端输入控件name属性的值保持一致
    @RequestMapping("/param2.do")
    public String param2(String name,Integer age){
        System.out.println(name);
        System.out.println(age);
        return "index";
    }

    @RequestMapping("/param3.do")
    public String param3 (@RequestParam("uname")String name,Integer age){
        System.out.println(name);
        System.out.println(age);
        return "index";
    }

    //@DateTimeFormat将提交的指定格式的日期字符串转为日期对象
    @RequestMapping("/param5.do")
    public String param5 (String name, Integer age,@DateTimeFormat(pattern = "yyyy-MM-dd") Date birth){
        System.out.println(name);
        System.out.println(age);
        System.out.println(birth);
        return "index";
    }
}

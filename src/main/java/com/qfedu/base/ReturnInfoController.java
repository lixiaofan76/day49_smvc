package com.qfedu.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
//将放入model中的指定数据放入session中
@SessionAttributes(value = {"age"})
public class ReturnInfoController {

    //设置访问控制器资源的路径
    @RequestMapping("/test1.do")
    public String test1(Model model){
        model.addAttribute("name","lisi");
        return "index";
    }
    @RequestMapping("/test2.do")
    public ModelAndView test2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("name","lisisi");
        return modelAndView;
    }
    @RequestMapping("/test3.do")
    public String test3(HttpServletRequest request){
        request.setAttribute("name","Tom");
        return "index";
    }
    @RequestMapping("/test4.do")
    public String test4(HttpSession session){
        session.setAttribute("name","Jerry");
        return "index";
    }
    @RequestMapping("/test5.do")
    public String test5(Model model){
        model.addAttribute("age","20");
        //默认转发

        //redirect:表示重定向，使用其修饰后，前缀后缀失效
        return "redirect:/index.jsp";
    }
}

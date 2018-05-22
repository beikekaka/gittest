package spring.mvc.controller;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import spring.mvc.domain.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoCommandController extends AbstractCommandController {

    //在构造函数中初始化command对象
    public DemoCommandController(){
        //页面封装数据到command对象，对应的实体为person
        this.setCommandClass(Person.class);
    }

    @Override
    protected ModelAndView handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object command, BindException e) throws Exception {
        Person p = (Person) command;
        System.out.println(p);
        return null;
    }
}

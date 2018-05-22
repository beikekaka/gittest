package spring.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class TestController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request,javax.servlet.http.HttpServletResponse response){
        System.out.println(request.getRequestURI());
        return new ModelAndView("index");
    }
}

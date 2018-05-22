package spring.mvc.controller;

import org.springframework.web.servlet.mvc.SimpleFormController;
import spring.mvc.domain.Person;

public class PersonFormController extends SimpleFormController {

    public PersonFormController(){
        //设置command
        this.setCommandClass(Person.class);
    }

    //提交后，交给业务处理
    protected void doSubmitAction(Object command){
        Person p = (Person)command;
        System.out.println(p);
    }
}

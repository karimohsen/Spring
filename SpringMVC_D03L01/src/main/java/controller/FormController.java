package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import utility.User;

import javax.validation.Valid;

/**
 * Created by Karim on 4/9/2015.
 */
@Controller
@RequestMapping("/form.htm")
public class FormController {
    @RequestMapping(method = RequestMethod.GET,params ="new" )
    public String CreateUser(Model model){
        User u = new User();
        u.setFname("test");
        u.setNum("9999-99");
        model.addAttribute("customer",u);
        return "form";
    }
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView CreateUser(@ModelAttribute("customer")@Valid User u,BindingResult br){
        System.out.println(br.hasErrors());
        if(br.hasErrors())
            return new ModelAndView("form");
        System.out.println(u.getFname());
        System.out.println(u.getNum());
        return new ModelAndView("done");
    }
}

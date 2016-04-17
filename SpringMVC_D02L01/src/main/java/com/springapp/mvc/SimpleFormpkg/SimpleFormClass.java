package com.springapp.mvc.SimpleFormpkg;

import com.springapp.mvc.pojo.UserData;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Karim on 4/6/2015.
 */
public class SimpleFormClass extends SimpleFormController {

    public SimpleFormClass() {
        setCommandClass(UserData.class);
        setCommandName("user");
    }


    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {

        UserData data = (UserData)super.formBackingObject(request);
        data.setAge(5);
        data.setName("hossam");
        return data;
    }

    @Override
    protected Map referenceData(HttpServletRequest request) throws Exception {
        return super.referenceData(request);
    }

    @Override
    protected ModelAndView onSubmit(Object command, BindException errors) throws Exception {
        UserData data = (UserData)command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("user",data);
        return mv;
    }
}

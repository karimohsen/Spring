package com.springapp.mvc.wizardcontroller;

import com.springapp.mvc.pojo.UserData;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Karim on 4/6/2015.
 */
public class WizardController extends AbstractWizardFormController{

    @Override
    protected ModelAndView processFinish(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, BindException e) throws Exception {
        UserData data = (UserData) o;
        return new ModelAndView("userAdded","user",data);
    }

    public WizardController() {
        setCommandClass(UserData.class);
        setCommandName("user");
    }

    @Override
    protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        UserData data = (UserData) command;
        return new ModelAndView("wizard1","user",data);
    }
}

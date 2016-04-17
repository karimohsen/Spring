package com.springapp.mvc.multiactionpkg;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Karim on 4/6/2015.
 */
public class MultiControllerForm extends MultiActionController{
    public ModelAndView multiOne(HttpServletRequest req,HttpServletResponse res){
        return new ModelAndView("multicontroller1");
    }
    public ModelAndView multiTwo(HttpServletRequest req,HttpServletResponse res){
        return new ModelAndView("multicontroller2");
    }
}

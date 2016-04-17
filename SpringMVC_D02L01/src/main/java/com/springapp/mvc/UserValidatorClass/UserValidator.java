package com.springapp.mvc.UserValidatorClass;

import com.springapp.mvc.pojo.UserData;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Karim on 4/6/2015.
 */
public class UserValidator implements Validator{


    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UserData.class);
    }

    @Override
    public void validate(Object o, Errors errors) {
        UserData user = (UserData)o;
        if(user.getAge()<4){
            errors.rejectValue("age","invalid.age","invalid age");
        }
        ValidationUtils.rejectIfEmpty(errors,"name","required.name","name is required");
    }
}

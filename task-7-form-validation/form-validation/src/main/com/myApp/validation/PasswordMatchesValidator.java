package main.com.myApp.validation;

import main.com.myApp.model.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, User> {

    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        return user.getPassword() != null &&
                user.getPassword().equals(user.getConfirmedPassword());
    }
}
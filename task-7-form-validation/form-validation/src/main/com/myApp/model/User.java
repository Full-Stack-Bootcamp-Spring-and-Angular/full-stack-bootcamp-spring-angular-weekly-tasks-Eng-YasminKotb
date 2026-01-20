package main.com.myApp.model;

import lombok.Getter;
import lombok.Setter;
import main.com.myApp.validation.PasswordMatches;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;




@PasswordMatches
@Setter
@Getter
public class User {

    @NotNull(message="this field cannot be empty or null")
    @Size(min=3, message ="username must be 3 characters or more")
    private String userName;

    @NotNull(message="Email is required")
    @Pattern(regexp ="^(.+)@(\\S+)$", message = "please enter a valid email")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;

    @NotBlank(message = "Confirm Password is required")
    private String confirmedPassword;
}

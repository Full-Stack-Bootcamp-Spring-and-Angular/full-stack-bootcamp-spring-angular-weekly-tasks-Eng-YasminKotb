package main.com.myApp.models;


import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Setter
@Getter
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dob;
    private String city;
}

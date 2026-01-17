package main.com.myApp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class User {
    private String userName;
    private String password;
    private String country;
    private String programmingLanguage;
    private List<String> operatingSystem;
}

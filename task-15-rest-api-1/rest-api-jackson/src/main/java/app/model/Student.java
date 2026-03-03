package app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private boolean active;

}

package main.myApp.entityBiDirectional;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "instructor")
@Setter
@Getter
@NoArgsConstructor
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "instructor_name")
    private String instructorName;

    @OneToMany(mappedBy = "instructor" , cascade = CascadeType.ALL)
    private List<Course> courses;


    public Instructor(String instructorName) {
        this.instructorName = instructorName;
    }

    public void addCourses(List<Course> courses){
        if (courses == null){
            courses = new ArrayList<>();
        }

        for (Course course : courses){
            course.setInstructor(this);
        }


    }
}
//
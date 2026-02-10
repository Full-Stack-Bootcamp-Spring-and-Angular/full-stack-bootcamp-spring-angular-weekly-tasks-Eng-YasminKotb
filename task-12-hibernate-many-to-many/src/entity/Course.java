package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "course")
@Setter
@Getter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    public Course(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

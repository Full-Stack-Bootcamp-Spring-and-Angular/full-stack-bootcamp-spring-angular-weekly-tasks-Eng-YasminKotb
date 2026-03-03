package app.controller;

import app.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //how user will reach this methode?
    @RequestMapping("/students")
    public List<Student> getStudents(){
        List<Student> studentList= new ArrayList<>();
        //define 2 students for example
        Student student1=new Student(1, "Yasmin", "Kotb", true);
        Student student2=new Student(2, "Shahd", "Kotb", true);

        //add students to the list
        studentList.add(student1);
        studentList.add(student2);


        //return list of students
        return studentList;
    }
}

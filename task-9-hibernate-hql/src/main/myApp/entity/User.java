package main.myApp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "users")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;


    @Transient
    @Column(name = "todaysDate")
    private Date todaysDate;

    @Column(name = "age")
    private String age;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setTodaysDate(Date todaysDate) {
        this.todaysDate = new Date();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", todaysDate=" + todaysDate +
                ", age='" + age + '\'' +
                '}';
    }
}

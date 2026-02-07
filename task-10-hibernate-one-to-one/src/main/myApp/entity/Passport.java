package main.myApp.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "passport")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "passport_no")
    private String passportNo;



    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    public Passport(String passportNo , LocalDate expiryDate) {
        this.passportNo = passportNo;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", passportNo='" + passportNo + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }

}

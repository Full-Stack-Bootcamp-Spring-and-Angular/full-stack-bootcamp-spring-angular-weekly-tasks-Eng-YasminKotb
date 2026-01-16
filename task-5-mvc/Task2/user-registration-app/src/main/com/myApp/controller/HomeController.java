package main.com.myApp.controller;

import main.com.myApp.dao.DatabaseOperations;
import main.com.myApp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@Controller
public class HomeController {

    private DatabaseOperations dao;

    public void setDatabaseOperations(DatabaseOperations dao) {
        this.dao = dao;
    }

    @RequestMapping("/")
    public String showRegistrationPage() {
        return "registration";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submitRegistration(HttpServletRequest request , Model model) {

        //getting parameters from request ${variable} in confirmation.jsp
        String firstName= request.getParameter("firstName");
        String lastName= request.getParameter("lastName");
        String email= request.getParameter("email");
        String dob= request.getParameter("dob");
        String city= request.getParameter("city");



        User user= new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        // dob comes as a String
        user.setDob(LocalDate.parse(dob));
        user.setCity(city);

        //save user to database
        dao.saveUser(user);

        //return the view with model
        model.addAttribute("user", user);

        return "confirmation";
    }
}
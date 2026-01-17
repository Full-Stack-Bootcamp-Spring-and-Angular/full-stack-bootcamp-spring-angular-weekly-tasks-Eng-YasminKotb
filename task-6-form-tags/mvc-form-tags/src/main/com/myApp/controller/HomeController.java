package main.com.myApp.controller;

import main.com.myApp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoUnit;

import static java.lang.Math.abs;

@Controller
public class HomeController
{



    @RequestMapping("/")
    public String showHomePage( Model model )
    {
        User user=new User();
        model.addAttribute("userData",user);
        return "homePage";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("userData") User user, Model model )
    {


        model.addAttribute("user", user);

        return "resultPage";
    }
}

package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String showWelcomePage()
    {
        return "welcomePage";
    }

    @RequestMapping("/calculate")
    public String showHomePage()
    {
        return "homePage";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request , Model model)
    {
        //getting parameters from request
        String year= request.getParameter("year");
        String month= request.getParameter("month");
        String day= request.getParameter("day");



        //When you get data from an HTML form in an MVC application, it comes as a String by default.
        int yearsDiff=LocalDate.now().getYear() - Integer.parseInt(year);
        int monthsDiff=Math.abs(LocalDate.now().getMonthValue() - Integer.parseInt(month));
        int daysDiff=Math.abs(LocalDate.now().getDayOfMonth() - Integer.parseInt(day));

        //adding data to the model
        model.addAttribute("years" , yearsDiff);
        model.addAttribute("months" , monthsDiff);
        model.addAttribute("days" , daysDiff);

        //return the view with model
        return "resultPage";
    }
}

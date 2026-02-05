package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

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


        Map<String, Integer> differences= calculateDateDifferences(year, month, day);


        //adding data to the model
        model.addAttribute("years" ,differences.get("years") );
        model.addAttribute("months" , differences.get("months"));
        model.addAttribute("days" , differences.get("days"));

        //return the view with model
        return "resultPage";
    }

    private Map<String, Integer> calculateDateDifferences(String yearStr, String monthStr, String dayStr){

        //When you get data from an HTML form in an MVC application, it comes as a String by default.
        int yearsDiff=LocalDate.now().getYear() - Integer.parseInt(yearStr);
        int monthsDiff=Math.abs(LocalDate.now().getMonthValue() - Integer.parseInt(monthStr));
        int daysDiff=Math.abs(LocalDate.now().getDayOfMonth() - Integer.parseInt(dayStr));

        Map<String, Integer> differences= new HashMap<>();
        differences.put("years", yearsDiff);
        differences.put("months", monthsDiff);
        differences.put("days", daysDiff);

        return differences;
    }


}

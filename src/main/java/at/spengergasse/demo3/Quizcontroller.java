package at.spengergasse.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLOutput;

@Controller
@RequestMapping("/quiz")
public class Quizcontroller {

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("test_attribute",1,2,3);
        System.out.println("Test wurde aufgerufen");
        return "demo_test";
    }
}

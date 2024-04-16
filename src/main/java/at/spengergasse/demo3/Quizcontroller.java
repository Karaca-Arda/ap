package at.spengergasse.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLOutput;

@Controller
@RequestMapping("/quiz")
public class Quizcontroller {

    private QuestionRepository repo;

    public Quizcontroller(QuestionRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/test")
    public String test(Model model){
        Question q = repo.findById(1).get();
        q.setText("Wie viele Beine hat ein Hund?");
        model.addAttribute("frage",q);
        System.out.println("Test wurde aufgerufen");
        return "demo_test";
    }

    @PostMapping("/save")

        public String save(Question q){
            System.out.println("Text verändert auf: " + q.getText());
            repo.save(q);
            return "redirect:/quiz/test";
        }

}

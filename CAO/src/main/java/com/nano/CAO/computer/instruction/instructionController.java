package com.nano.CAO.computer.instruction;
import ch.qos.logback.core.model.Model;
import com.nano.CAO.QandA.QandAService;
import com.nano.CAO.QandA.QuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;

@Controller
public class instructionController {
    @Autowired
    QandAService qandAService;
    @GetMapping("/instruction")
    public ModelAndView instructionSet(Model model){
        ModelAndView modelAndView = new ModelAndView("instruction/instruction.html");
        QuestionAnswer newQuestionAnswer = new QuestionAnswer();
        newQuestionAnswer.setTutorial(5);
        modelAndView.addObject("newQandA", newQuestionAnswer);
        modelAndView.addObject("qAndAs", qandAService.getQuestions(5));
        return modelAndView;
    }
}

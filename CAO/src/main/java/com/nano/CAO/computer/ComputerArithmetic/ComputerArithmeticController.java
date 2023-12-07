package com.nano.CAO.computer.ComputerArithmetic;

import ch.qos.logback.core.model.Model;
import com.nano.CAO.QandA.QandAService;
import com.nano.CAO.QandA.QuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ComputerArithmeticController {
    @Autowired
    QandAService qandAService;

    @GetMapping("/arithmetic")
    public ModelAndView arithmeticController(Model model){
        ModelAndView modelAndView = new ModelAndView("computerArithmetic/ComputerArithmetic.html");
        QuestionAnswer newQuestionAnswer = new QuestionAnswer();
        newQuestionAnswer.setTutorial(4);
        modelAndView.addObject("newQandA",newQuestionAnswer);
        modelAndView.addObject("qAndAs", qandAService.getQuestions(4));
        return modelAndView;

    }
}

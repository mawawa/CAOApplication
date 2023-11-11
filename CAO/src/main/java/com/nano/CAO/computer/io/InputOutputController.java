package com.nano.CAO.computer.io;

import com.nano.CAO.QandA.QandAService;
import com.nano.CAO.QandA.QuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InputOutputController {
    @Autowired
    QandAService qandAService;
    @RequestMapping("io")
    public ModelAndView io() {
        ModelAndView modelAndView = new ModelAndView("inputOutput/IO.html");
        QuestionAnswer newQuestionAnswer = new QuestionAnswer();
        newQuestionAnswer.setTutorial(3);
        modelAndView.addObject("newQandA", newQuestionAnswer);
        modelAndView.addObject("qAndAs", qandAService.getQuestions(3));
        return modelAndView;
    }
}

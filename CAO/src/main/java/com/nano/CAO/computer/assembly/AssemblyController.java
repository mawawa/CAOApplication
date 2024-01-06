package com.nano.CAO.computer.assembly;

import ch.qos.logback.core.model.Model;
import com.nano.CAO.QandA.QandAService;
import com.nano.CAO.QandA.QuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class AssemblyController {

    @Autowired
    QandAService qandAService;

    @GetMapping("/assembly")
    public ModelAndView arithmeticController(Model model){
        ModelAndView modelAndView = new ModelAndView("assembly/assembly.html");
        QuestionAnswer newQuestionAnswer = new QuestionAnswer();
        newQuestionAnswer.setTutorial(8);
        modelAndView.addObject("newQandA",newQuestionAnswer);
        modelAndView.addObject("qAndAs", qandAService.getQuestions(8));
        return modelAndView;

    }
}

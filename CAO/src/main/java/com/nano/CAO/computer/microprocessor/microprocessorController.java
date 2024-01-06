package com.nano.CAO.computer.microprocessor;

import ch.qos.logback.core.model.Model;
import com.nano.CAO.QandA.QandAService;
import com.nano.CAO.QandA.QuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class microprocessorController {

    @Autowired
    QandAService qandAService;

    @GetMapping("/microprocessors")
    public ModelAndView arithmeticController(Model model){
        ModelAndView modelAndView = new ModelAndView("microprocessors/microprocessor.html");
        QuestionAnswer newQuestionAnswer = new QuestionAnswer();
        newQuestionAnswer.setTutorial(7);
        modelAndView.addObject("newQandA",newQuestionAnswer);
        modelAndView.addObject("qAndAs", qandAService.getQuestions(7));
        return modelAndView;

    }
}

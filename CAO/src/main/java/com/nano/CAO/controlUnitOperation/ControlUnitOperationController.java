package com.nano.CAO.controlUnitOperation;

import ch.qos.logback.core.model.Model;
import com.nano.CAO.QandA.QandAService;
import com.nano.CAO.QandA.QuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControlUnitOperationController {

    @Autowired
    QandAService qandAService;

    @GetMapping("/controlunit")
    public ModelAndView arithmeticController(Model model){
        ModelAndView modelAndView = new ModelAndView("controlUnitOperation/controlUnit.html");
        QuestionAnswer newQuestionAnswer = new QuestionAnswer();
        newQuestionAnswer.setTutorial(6);
        modelAndView.addObject("newQandA",newQuestionAnswer);
        modelAndView.addObject("qAndAs", qandAService.getQuestions(6));
        return modelAndView;

    }
}

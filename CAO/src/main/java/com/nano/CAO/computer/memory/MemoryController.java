package com.nano.CAO.computer.memory;

import com.nano.CAO.QandA.QandAService;
import com.nano.CAO.QandA.QuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemoryController {

    @Autowired
    QandAService qandAService;
    @RequestMapping("memory")
    public ModelAndView memory(){
        ModelAndView modelAndView = new ModelAndView("memory/Memory.html");
        QuestionAnswer newQuestionAnswer = new QuestionAnswer();
        newQuestionAnswer.setTutorial(2);
        modelAndView.addObject("newQandA",newQuestionAnswer);
        modelAndView.addObject("qAndAs", qandAService.getQuestions(2));
        return modelAndView;
    }


}

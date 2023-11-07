package com.nano.CAO;


import com.nano.CAO.QandA.QandAService;
import com.nano.CAO.QandA.QuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CAOController {
    @Autowired
    QandAService qandAService;
    //when the home url is entered.
    @RequestMapping("home")
    public ModelAndView cao(){
        ModelAndView modelAndView = new ModelAndView("CAO.html");
        modelAndView.addObject("newQandA", new QuestionAnswer());
        modelAndView.addObject("qAndAs", qandAService.getQuestions());
        return modelAndView;
    }
}

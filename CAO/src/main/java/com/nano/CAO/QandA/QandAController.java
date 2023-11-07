package com.nano.CAO.QandA;


import com.nano.CAO.CAOController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QandAController {
    @Autowired
    QandAService qandAService;

    @PostMapping("addQandA")
    public ModelAndView addQA(@ModelAttribute QuestionAnswer newQandA){
        qandAService.addQuestion(newQandA);
        ModelAndView mav = new ModelAndView("CAO.html");
        mav.addObject("newQandA" , new QuestionAnswer());
        mav.addObject("qAndAs" , qandAService.getQuestions());
        return mav;
    }

    @RequestMapping("/deleteQandA")
    public ModelAndView deleteQandA(@RequestParam Long sysId){
        qandAService.deleteQuestionById(sysId);
        ModelAndView mav = new ModelAndView("CAO.html");
        mav.addObject("newQandA" , new QuestionAnswer());
        mav.addObject("qAndAs" , qandAService.getQuestions());
        return mav;
    }
}

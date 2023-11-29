package com.nano.CAO.computer.instruction;
import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;

@Controller
public class instructionController {

    @GetMapping("/instruction")
    public ModelAndView instructionSet(Model model){
        ModelAndView modelAndView = new ModelAndView("instruction/instruction.html");
        modelAndView.addObject("time" , Calendar.getInstance().getTime());
        return modelAndView;
    }
}

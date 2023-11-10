package com.nano.CAO.computer.io;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InputOutputController {

    @RequestMapping("io")
    public ModelAndView io(){
        return new ModelAndView("inputOutput/IO.html");
    }
}

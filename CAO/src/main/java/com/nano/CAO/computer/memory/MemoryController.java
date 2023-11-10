package com.nano.CAO.computer.memory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemoryController {
    @RequestMapping("memory")
    public String memory(){
        return "memory/Memory.html";
    }


}

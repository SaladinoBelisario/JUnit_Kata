package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @RequestMapping("/welcome")
    public String welcome(@RequestParam(required = false, name = "param") String[] paramArray){
        StringBuilder msg= new StringBuilder();
        int i = 0;
        if (paramArray == null){
            msg = new StringBuilder("Array Vacío");
        }else {
            for (String paramArrayItem:
                 paramArray) {
                msg.append(paramArrayItem);
            }
        }
        return msg.toString();
    }
}

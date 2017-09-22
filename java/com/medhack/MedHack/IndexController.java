package com.medhack.MedHack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SunimalM on 9/19/2017.
 */

@RestController
@RequestMapping("/")
public class IndexController {
    @RequestMapping
    public String index(){
        return "index.html";
    }
}

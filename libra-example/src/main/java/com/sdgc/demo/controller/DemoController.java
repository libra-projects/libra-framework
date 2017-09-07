package com.sdgc.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by titengjiang on 2017/9/7.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping(method = RequestMethod.GET)
    public String demo() {
        return "helloLibra";
    }
}

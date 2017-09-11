package com.sdgc.demo.controller;

import com.sdgc.demo.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by titengjiang on 2017/9/7.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoMapper mapper;

    @RequestMapping(method = RequestMethod.GET ,value = "/demo.html")
    public String demo(Model model) {
        List<Object> results = mapper.getAll();
        model.addAttribute("message", "44444");
        return "demo";
    }
}

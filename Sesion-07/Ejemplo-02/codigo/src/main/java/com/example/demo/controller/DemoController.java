package com.example.demo.controller;

import com.example.demo.entity.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro")
@Slf4j
public class DemoController {
    
    @PostMapping("/auto")
    public void recibe(@RequestBody Auto auto){
        log.info(auto.toString());
    }
}

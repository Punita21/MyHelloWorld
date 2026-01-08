package com.punni.myhelloworld;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHelloWorldController {

    @RequestMapping("/hello")
    public ResponseEntity<String> helloMsg(){
        return ResponseEntity.ok("welcome to my world");
    }
}

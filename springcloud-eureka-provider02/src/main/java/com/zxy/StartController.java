package com.zxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @Value("${server.port}")
    public String port;

    @RequestMapping("/info")
    public String index(String s) {
        return "info";
    }

    @RequestMapping("/HelloWorld")
    public String helloWorld(String s) {
        return port + "传入的值为：" + s;
    }
}

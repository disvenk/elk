package com.disvenk.elk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("logstashTest")
public class LogstashController {

    @RequestMapping("logTest")
    public String logTest(){
        log.info("这是第一个log日志");
        return "111";
    }
}

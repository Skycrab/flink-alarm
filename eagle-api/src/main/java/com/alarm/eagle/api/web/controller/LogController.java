package com.alarm.eagle.api.web.controller;

import com.alarm.eagle.response.Response;
import com.alarm.eagle.response.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skycrab on 18/1/4.
 */
@RestController
@RequestMapping("/log")
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/trace")
    public Response receive(String data) {
        logger.info("data={}", data);
        return ResponseUtil.success();
    }
}

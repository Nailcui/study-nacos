package com.example.consumer.service;

import com.example.consumer.api.HelloApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author dingyu
 * @date 2021-08-24 23:27
 */
@Slf4j
@Service
public class HelloService {

    @Resource
    private HelloApi helloApi;

    @PostConstruct
    public void init() {
        String response = helloApi.hello();
        log.info("hello api response: {}", response);
    }
}

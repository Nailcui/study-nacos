package com.example.consumer.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dingyu
 * @date 2021-08-24 23:24
 */
@FeignClient("study-nacos-provider")
public interface HelloApi {

    /**
     * hello
     * @return str
     */
    @GetMapping(value = "/hello")
    @ResponseBody
    String hello();

}

package com.learn.springbootdemo.controller;

import com.learn.springbootdemo.base.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by linzj on 2019/1/16
 **/

@RestController
public class PersonInfoController {

    @GetMapping("/getInfo")
    public ApiResponse getInfo(@RequestParam("jsonstring")String jsonstring){

        return ApiResponse.ofSuccess(null);
    }
}

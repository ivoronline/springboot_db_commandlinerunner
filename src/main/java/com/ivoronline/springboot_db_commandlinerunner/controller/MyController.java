package com.ivoronline.springboot_db_commandlinerunner.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  //=========================================================================================================
  // HELLO
  //=========================================================================================================
  @ResponseBody
  @RequestMapping("Hello")
  String hello() throws JsonProcessingException {
    return "OK";
  }

}

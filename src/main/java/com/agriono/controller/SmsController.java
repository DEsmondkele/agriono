package com.agriono.controller;

import com.agriono.services.sms.Service;
import com.agriono.services.sms.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@org.springframework.stereotype.Service
@RequestMapping("api/")
public class SmsController {
   @Autowired
    Service service;

   @PostMapping("/sms")
   public void sendSms(@Valid @RequestBody SmsRequest smsRequest){
       service.sendSms(smsRequest);
   }
}

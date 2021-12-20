package com.agriono.services.sms;

import com.twilio.Twilio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class TwilioInitializer {

    @Autowired
    TwilioConfiguration twilioConfiguration;

    @Autowired
 public  TwilioInitializer(TwilioConfiguration config){
     this.twilioConfiguration = config;
     Twilio.init(config.getUserName(),
             config.getAuthToken(),
             config.getAccountSid());
        log.info("Twilio initialized ... with account sid {}",
                twilioConfiguration.getAccountSid());
    }
}

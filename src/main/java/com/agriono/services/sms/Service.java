package com.agriono.services.sms;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    TwilioSmsSender twilioSmsSender;
    @Autowired
    public Service(TwilioSmsSender twilioSmsSender){
        this.twilioSmsSender = twilioSmsSender;
    }
    public void sendSms(SmsRequest smsRequest){
        twilioSmsSender.sendTxt(smsRequest);
    }
}

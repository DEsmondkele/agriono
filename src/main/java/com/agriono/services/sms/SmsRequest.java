package com.agriono.services.sms;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SmsRequest {
    @NotBlank
    private final String phoneNumber;
    @NotBlank
    private final String message;
    public SmsRequest(@JsonProperty("phoneNumber")String phoneNumber,
                      @JsonProperty("message")String message){
        this.phoneNumber =phoneNumber;
        this.message =message;
    }

    @Override
    public String toString() {
        return "SmsRequest{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

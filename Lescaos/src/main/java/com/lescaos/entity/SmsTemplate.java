package com.lescaos.entity;

/**
 * @auther xiaming
 * @date 2016-02-18 10:35
 * version 1.0
 */

public class SmsTemplate {
    private String phoneNum;

    private String smsTemplateCode;

    private String paramString;

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSmsTemplateCode() {
        return smsTemplateCode;
    }

    public void setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
    }

    public String getParamString() {
        return paramString;
    }

    public void setParamString(String paramString) {
        this.paramString = paramString;
    }
}

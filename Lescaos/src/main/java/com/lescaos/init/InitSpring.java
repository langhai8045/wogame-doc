package com.lescaos.init;

import com.lescaos.entity.SmsTemplate;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * @auther xiaming
 * @date 2016-02-18 10:21
 * version 1.0
 */
@Controller
@SpringBootApplication
public class InitSpring {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(InitSpring.class);

    @RequestMapping(value = "/sendSms", method = RequestMethod.GET)
    public void sendSms(HttpServletRequest request, HttpServletResponse response) throws Exception{
        TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "23310543", "b0fd1cfab361eb316bb5d3f78b60b661");
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
        SmsTemplate smsTemplate = paramInit(request);
        logger.info(smsTemplate.getParamString() + "---" + smsTemplate.getPhoneNum() + "---" + smsTemplate.getSmsTemplateCode());
        req.setSmsType("normal");
        req.setSmsFreeSignName("活动验证");
        req.setSmsParamString(smsTemplate.getParamString());
        req.setRecNum(smsTemplate.getPhoneNum());
        req.setSmsTemplateCode(smsTemplate.getSmsTemplateCode());
        AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
        PrintWriter out = response.getWriter();
        out.println(rsp.getBody());
    }


    public SmsTemplate paramInit(HttpServletRequest request) {
        SmsTemplate smsTemplate = new SmsTemplate();
        smsTemplate.setParamString(request.getParameter("param_string"));
        smsTemplate.setPhoneNum(request.getParameter("phone_num"));
        smsTemplate.setSmsTemplateCode(request.getParameter("template_code"));
        return smsTemplate;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(InitSpring.class, args);
    }
}

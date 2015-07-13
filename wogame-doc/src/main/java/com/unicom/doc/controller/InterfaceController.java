package com.unicom.doc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 接口管理Controller
 *
 * @auther xiaming
 * @date 2015-07-08 08:58
 * version 1.0
 */
@Controller
@RequestMapping(value = "/interface")
public class InterfaceController {
    private static final String LIST_URL = "/interface/list";

    @RequestMapping("/list")
    public String list(HttpServletRequest request, HttpServletResponse response){
        return LIST_URL;
    }
}

package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private AdminService asi;

    @RequestMapping("test")
    public String test(){
        List<Admin> list = (List<Admin>) asi.queryall();
        return "index";
    }
}

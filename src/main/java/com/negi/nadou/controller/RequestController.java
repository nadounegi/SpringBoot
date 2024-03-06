package com.negi.nadou.controller;

import com.itheima.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class RequestController {
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
////        リクエストパラメータの取得
//        String name = request.getParameter("name");
//        String agestr = request.getParameter("age");
//
//        int age = Integer.parseInt(agestr);
//        System.out.println(name + ":" +age);
//        return "OK";
//    }
    //springboot方式
//@RequestMapping("/simpleParam")
//public String simpleParam(String name,Integer age) {
////        リクエストパラメータの取得
//    System.out.println(name + ":" +age);
//    return "OK";
//}
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name="name",required = false) String username, Integer age) {
        System.out.println(username+":"+age);
        return "OK";
    }
    //実体参数
    @RequestMapping("/simplePojo")
    public String simplePojo(com.itheima.pojo.User user){
        System.out.println(user);
        return "OK";
    }
    //集合とリスト参数
    //リスト参数
    @RequestMapping("/arrayParam")
    public String arrayParam(String[]hobby){
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }
    //集合参数
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String>hobby){
        System.out.println(hobby);
        return "OK";
    }
    //日期参数
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")LocalDateTime updateTime){
        System.out.println(updateTime);
        return "OK";
    }
    //Json参数
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    }

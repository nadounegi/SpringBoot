package com.negi.nadou.controller;

import com.itheima.pojo.Address;
import com.itheima.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {
//    @RequestMapping("/hello")
//    public String hello() {
//        System.out.println("hello springboot");
//        return "hello springboot";
//    }
//
//    @RequestMapping("/getAddr")
//    public Address getAddr(){
//        Address addr = new Address();
//        addr.setProvince("目黒区");
//        addr.setCity("東京都");
//        return addr;
//    }
//
//    @RequestMapping("/listAddr")
//    public List<Address>listAddr(){
//        List<Address>list = new ArrayList<>();
//        Address addr = new Address();
//        addr.setProvince("目黒区");
//        addr.setCity("東京都");
//
//        Address addr2 = new Address();
//        addr2.setProvince("渋谷区");
//        addr2.setCity("東京都");
//
//        list.add(addr);
//        list.add(addr2);
//        return list;
//    }
@RequestMapping("/hello")
public Result hello() {
    System.out.println("hello springboot");
//    return new Result(1,"success","hello springboot");
    return Result.success("hello springboot");
}

    @RequestMapping("/getAddr")
    public Result getAddr(){
        Address addr = new Address();
        addr.setProvince("目黒区");
        addr.setCity("東京都");
        return Result.success(addr);
    }

    @RequestMapping("/listAddr")
    public Result listAddr(){
        List<Address>list = new ArrayList<>();
        Address addr = new Address();
        addr.setProvince("目黒区");
        addr.setCity("東京都");

        Address addr2 = new Address();
        addr2.setProvince("渋谷区");
        addr2.setCity("東京都");

        list.add(addr);
        list.add(addr2);
        return Result.success(list);
    }

}

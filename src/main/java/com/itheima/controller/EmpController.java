package com.itheima.controller;

import com.itheima.Service.EmpService;
import com.itheima.Service.impl.EmpServiceA;
import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    private EmpService empService =new EmpServiceA();
    @RequestMapping("/listEmp")
    public Result list() {
        //1、EmpServiceを呼び出し、社員リストを獲得する
        List<Emp>empList = empService.listEmp();
        //3、データをレスポンスする
        return Result.success(empList);
    }

}
//        //１、emp.xmlを解析する
//        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
//        //2、データを転換する　-gender,job
//        empList.stream().forEach(emp -> {
//            //2.1 処理gender　１：男　２：女
//            String gender = emp.getGender();
//            if ("1".equals(gender)) {
//                emp.setGender("男");
//            } else if ("2".equals(gender)) {
//                emp.setGender("女");
//            }
//            //2.2 処理job　１：講師　２：担当先生　３：キャリアサポート
//            String job = emp.getJob();
//            if ("1".equals(job)) {
//                emp.setJob("讲师");
//            } else if ("2".equals(job)) {
//                emp.setJob("班主任");
//            } else if ("3".equals(job)) {
//                emp.setJob("就业指导");
//            }
//        });
//        //3、結果を返す
//        return Result.success(empList);
//    }


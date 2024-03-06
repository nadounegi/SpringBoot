package com.itheima.Service.impl;

import com.itheima.Dao.EmpDao;
import com.itheima.Dao.impl.EmpDaoA;
import com.itheima.Service.EmpService;
import com.itheima.pojo.Emp;

import java.util.List;

public class EmpServiceA implements EmpService {
    private EmpDao empDao = new EmpDaoA();
    @Override
    public List<Emp> listEmp() {
        //１、EmpDaoを呼び出し、社員リストを獲得する
        List<Emp> empList = empDao.listEmp();

        //2、データを転換する　-gender,job
        empList.stream().forEach(emp -> {
            //2.1 処理gender　１：男　２：女
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            }
            //2.2 処理job　１：講師　２：担当先生　３：キャリアサポート
            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}

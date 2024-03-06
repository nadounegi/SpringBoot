package com.itheima.Dao;

import com.itheima.pojo.Emp;

import java.util.List;

public interface EmpDao {
    //社員リストデータを獲得する
    public List<Emp> listEmp();
}

package com.mybatis.service;

import com.mybatis.dao.EmployeeMapper;
import com.mybatis.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanggenshen_sx on 2016/12/26.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeServiceImpl() {
        System.out.printf("init EmployeeServiceImpl");
    }

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee getEmployee(int id){
        return employeeMapper.getEmployeeById(id);
    }

    public List<Employee> getEmployees(){
        return employeeMapper.getAllEmployees();
    }

}
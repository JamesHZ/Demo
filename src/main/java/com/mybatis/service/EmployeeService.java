package com.mybatis.service;

import com.mybatis.model.Employee;

import java.util.List;

/**
 * Created by wanggenshen_sx on 2016/12/26.
 */
public interface EmployeeService {
    Employee getEmployee(int id);

    List<Employee> getEmployees();
}
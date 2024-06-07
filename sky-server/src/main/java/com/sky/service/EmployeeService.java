package com.sky.service;

import com.sky.annotation.AutoFill;
import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.enumeration.OperationType;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);
    @AutoFill(value = OperationType.INSERT)
    void save(EmployeeDTO employeeDto);

    PageResult pagequery(EmployeePageQueryDTO employeePageQueryDTO);

    void startOrstop(Integer status, Long id);

    Employee getById(Long id);
    @AutoFill(value = OperationType.INSERT)
    void update(EmployeeDTO employeeDTO);
}

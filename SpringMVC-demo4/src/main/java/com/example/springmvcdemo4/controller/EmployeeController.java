package com.example.springmvcdemo4.controller;

import com.example.springmvcdemo4.bean.Employee;
import com.example.springmvcdemo4.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getallemployee(Model model){
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("employeelist",all);


        return "employ_list";
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") int id){
        employeeDao.delete(id);
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String add(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public String toupdate(@PathVariable("id") int id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee",employee);
        return "employee_update";

    }

    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public String update(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }
}

package com.vladyslav.springBoo.Controller;

import com.vladyslav.springBoo.Entity.Employee;
import com.vladyslav.springBoo.Service.IService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private IService iService;


    public EmployeeRestController(IService theIService){
        iService = theIService;
    }

    @GetMapping("/employees")
    public List<Employee> showAllEmployee(){

        return iService.findAll();
    }

    @GetMapping("/employees/{theId}")
    public Employee getEmployeeById(@PathVariable int theId){

        return iService.findEmployeeById(theId);
    }

    @PostMapping("/employees")
    public String savenewEmployee(@RequestBody Employee theEmployee){

        iService.save(theEmployee);

        return "Success";
    }

    @DeleteMapping("/employees/{theId}")
    public String deleteById(@PathVariable int theId){
        iService.deleteById(theId);
        return "Employee was delete, id " + theId;
    }

    @PutMapping("/employees")
    public String updateEmployee(@RequestBody Employee theEmployee){
        iService.update(theEmployee);
        return "Employee was update";
    }
}

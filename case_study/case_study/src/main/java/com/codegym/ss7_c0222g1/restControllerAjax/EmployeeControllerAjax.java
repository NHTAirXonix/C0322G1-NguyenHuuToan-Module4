package com.codegym.ss7_c0222g1.restControllerAjax;

import com.codegym.ss7_c0222g1.model.employee.Employee;
import com.codegym.ss7_c0222g1.service.employee.IEmployeeService;
import com.codegym.ss7_c0222g1.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employeeAjax")
public class EmployeeControllerAjax {
    @Autowired
    private IUserService iUserService;

    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("/list")
    public ResponseEntity<?> showListEmployee(@RequestParam(name = "page", defaultValue = "0") int page) {
        Sort sort = Sort.by("employee_id");
        List<Employee> employeeList = iEmployeeService.findAll( PageRequest.of(page, 5, sort)).getContent();
        return new ResponseEntity<>(employeeList,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> addNewEmployee(@Valid @RequestBody Employee employee, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            List<FieldError> errors = bindingResult.getFieldErrors();
            Map<String, String> errorList = new LinkedHashMap<>();
            for (FieldError item : errors) {
                String field = item.getField();
                String msg = item.getDefaultMessage();
                errorList.put(field, msg);
            }
            return new ResponseEntity<>(errorList, HttpStatus.BAD_REQUEST);
        } else {
            iUserService.create(employee.getUser());
            iEmployeeService.create(employee);
            List<Employee> employeeList = iEmployeeService.findAllList();
            return new ResponseEntity<>(employeeList, HttpStatus.CREATED);
        }
    }

    @GetMapping("/edit/{id}")
    public ResponseEntity<?> findEmployeeByIdToEdit(@PathVariable("id") Integer id){
        Employee employee= iEmployeeService.findEmployeeById(id);
        if (employee == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<?> editEmployee(@RequestBody Employee employee){
        iUserService.create(employee.getUser());
        iEmployeeService.create(employee);
        List<Employee> employeeList = iEmployeeService.findAllList();
        return new ResponseEntity<>(employeeList, HttpStatus.CREATED);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> findEmployeeByIdToDelete(@PathVariable("id") Integer id){
        Employee employee= iEmployeeService.findEmployeeById(id);
        if (employee == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/remove/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id){
        iEmployeeService.removeById(id);
        List<Employee> employeeList = iEmployeeService.findAllList();
        return new ResponseEntity<>(employeeList, HttpStatus.CREATED);
    }
}

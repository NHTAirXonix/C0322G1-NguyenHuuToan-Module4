package com.codegym.ss7_c0222g1.restControllerAjax;

import com.codegym.ss7_c0222g1.model.employee.Employee;
import com.codegym.ss7_c0222g1.model.facility.Facility;
import com.codegym.ss7_c0222g1.model.facility.RentType;
import com.codegym.ss7_c0222g1.service.customer.CustomerTypeService;
import com.codegym.ss7_c0222g1.service.service.RentTypeService;
import com.codegym.ss7_c0222g1.service.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Service;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/serviceAjax")
public class ServiceControllerAjax {

    @Autowired
    private ServiceService serviceService;

    @Autowired
    private RentTypeService rentTypeService;

    @Autowired
    private CustomerTypeService customerTypeService;

    @PostMapping("/createVilla")
    public ResponseEntity<?> addNewVilla(@RequestBody Facility facility){
        serviceService.save(facility);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/createHouse")
    public ResponseEntity<?> addNewHouse(@RequestBody Facility facility){
        serviceService.save(facility);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/createRoom")
    public ResponseEntity<?> addNewRoom(@RequestBody Facility facility){
        serviceService.save(facility);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/edit/{id}")
    public ResponseEntity<?> findEmployeeByIdToEdit(@PathVariable("id") Integer id){
        List<Facility> serviceList = serviceService.searchByName("");
        List<RentType> rentTypeList = rentTypeService.findAll();
        List<Object> result = new ArrayList<>();
        result.add(serviceList);
        result.add(rentTypeList);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/updateService")
    public ResponseEntity<?> editService(@RequestBody Facility facility){
        serviceService.save(facility);
        List<Facility> serviceList = serviceService.searchByName("");
        return new ResponseEntity<>(serviceList, HttpStatus.CREATED);
    }

    @PostMapping("/reload")
    public ResponseEntity<?> reload(){
        List<Facility> serviceList = serviceService.searchByName("");
        return new ResponseEntity<>(serviceList, HttpStatus.CREATED);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> findEmployeeByIdToDelete(@PathVariable("id") Integer id){
        Facility facility= serviceService.findById(id);
        if (facility == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(facility, HttpStatus.OK);
    }

    @PostMapping("/remove/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id){
        serviceService.delete(id);
        List<Facility> facilityList = serviceService.searchByName("");
        return new ResponseEntity<>(facilityList, HttpStatus.CREATED);
    }
}

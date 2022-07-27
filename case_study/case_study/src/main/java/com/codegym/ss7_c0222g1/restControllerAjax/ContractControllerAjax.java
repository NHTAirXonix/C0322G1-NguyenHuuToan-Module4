package com.codegym.ss7_c0222g1.restControllerAjax;

import com.codegym.ss7_c0222g1.model.contract.ContractDetail;
import com.codegym.ss7_c0222g1.model.employee.Employee;
import com.codegym.ss7_c0222g1.service.contract.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contractAjax")
public class ContractControllerAjax {

    @Autowired
    private ContractDetailService contractDetailService;

    @PostMapping("/showListAttachService/{id}")
    public ResponseEntity<?> showListAttachService(@PathVariable("id") Integer id) {
        List<ContractDetail> contractDetailList = contractDetailService.findByIdOfContract(id);
        return new ResponseEntity<>(contractDetailList, HttpStatus.OK);
    }
}

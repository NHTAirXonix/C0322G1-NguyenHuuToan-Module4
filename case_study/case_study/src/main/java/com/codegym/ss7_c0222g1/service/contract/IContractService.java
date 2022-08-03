package com.codegym.ss7_c0222g1.service.contract;

import com.codegym.ss7_c0222g1.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IContractService {
    Page<Contract> findAllContract(Pageable pageable);

    Double getTotalPay();

    Contract findById(Integer id);

    void save(Contract contract);

    List<Contract> findAll2();
}

package com.codegym.ss7_c0222g1.service.contract;

import com.codegym.ss7_c0222g1.model.contract.Contract;
import com.codegym.ss7_c0222g1.repository.contract.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContractService implements IContractService {

    @Autowired
    private ContractRepository contractRepository;



    @Override
    public Page<Contract> findAllContract(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public Double getTotalPay() {
        return 5000000.0;
    }

    @Override
    public Contract findById(Integer id) {
        return contractRepository.findById2(id);
    }


}

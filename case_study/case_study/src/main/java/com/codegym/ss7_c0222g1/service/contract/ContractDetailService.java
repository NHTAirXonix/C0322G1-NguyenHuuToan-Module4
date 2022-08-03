package com.codegym.ss7_c0222g1.service.contract;

import com.codegym.ss7_c0222g1.model.contract.ContractDetail;
import com.codegym.ss7_c0222g1.repository.contract.ContractDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {

    @Autowired
    private ContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public void Save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public List<ContractDetail> findByIdOfContract(Integer id) {
        return contractDetailRepository.findByIdOfContract(id);
    }
}

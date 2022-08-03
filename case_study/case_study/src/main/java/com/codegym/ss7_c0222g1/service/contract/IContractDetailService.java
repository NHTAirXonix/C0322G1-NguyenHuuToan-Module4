package com.codegym.ss7_c0222g1.service.contract;

import com.codegym.ss7_c0222g1.model.contract.AttachService;
import com.codegym.ss7_c0222g1.model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    List<ContractDetail> findAll();

    void Save(ContractDetail contractDetail);

    List<ContractDetail> findByIdOfContract(Integer id);
}

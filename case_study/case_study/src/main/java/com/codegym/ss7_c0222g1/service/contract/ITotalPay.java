package com.codegym.ss7_c0222g1.service.contract;

import com.codegym.ss7_c0222g1.model.contract.AttachService;
import com.codegym.ss7_c0222g1.model.contract.Contract;
import com.codegym.ss7_c0222g1.model.contract.ContractDetail;
import com.codegym.ss7_c0222g1.model.facility.Facility;

import java.util.List;

public interface ITotalPay {

    List<Double> getTotalPay(List<Contract> contractList,
                       List<AttachService> attachServiceList,
                       List<ContractDetail> contractDetailList,
                       List<Facility> facilityList
                       );
}

package com.codegym.ss7_c0222g1.service.contract;

import com.codegym.ss7_c0222g1.model.contract.AttachService;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

public interface IAttachService {

    List<AttachService> findAllAttachService();

    AttachService findById(Integer id);


}

package com.codegym.ss7_c0222g1.repository.contract;

import com.codegym.ss7_c0222g1.model.contract.Contract;
import com.codegym.ss7_c0222g1.model.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ContractDetailRepository extends JpaRepository<ContractDetail,Integer> {

    @Query(value = "select * from contract_detail where contract_id =:id ", nativeQuery = true)
    List<ContractDetail> findByIdOfContract(@Param("id") Integer id);

}

//findByIdOfContract

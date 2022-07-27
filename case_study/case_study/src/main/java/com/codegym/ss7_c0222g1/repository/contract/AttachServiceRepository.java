package com.codegym.ss7_c0222g1.repository.contract;

import com.codegym.ss7_c0222g1.model.contract.AttachService;
import com.codegym.ss7_c0222g1.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface AttachServiceRepository extends JpaRepository<AttachService, Integer> {

    @Query(value = "select * from attach_service where attach_service_id = :id ", nativeQuery = true)
    AttachService findById2(@Param("id") Integer id);
}

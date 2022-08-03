package com.codegym.ss7_c0222g1.repository.Service;

import com.codegym.ss7_c0222g1.model.facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface RentTypeRepository extends JpaRepository<RentType, Integer> {
}

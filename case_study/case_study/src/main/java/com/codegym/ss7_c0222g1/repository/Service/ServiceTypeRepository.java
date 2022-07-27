package com.codegym.ss7_c0222g1.repository.Service;

import com.codegym.ss7_c0222g1.model.facility.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ServiceTypeRepository extends JpaRepository<FacilityType, Integer> {
}

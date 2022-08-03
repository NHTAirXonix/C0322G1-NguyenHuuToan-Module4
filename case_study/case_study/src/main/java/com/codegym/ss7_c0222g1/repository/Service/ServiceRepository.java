package com.codegym.ss7_c0222g1.repository.Service;

import com.codegym.ss7_c0222g1.model.facility.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ServiceRepository extends JpaRepository<Facility, Integer> {

    @Query(value = "select * from facility where status = 0 and `name` like %:iname% ", nativeQuery = true)
    List<Facility> searchByName(@Param("iname") String iname);

    @Modifying
    @Query(value = "update  facility set status = 1 where id = :idi", nativeQuery = true)
    void delete(@Param("idi") int idi);

    @Query(value = "select * from facility where status = 0 and id = :id ", nativeQuery = true)
    Facility findById2(@Param("id") Integer id);
}

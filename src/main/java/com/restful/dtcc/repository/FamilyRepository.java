package com.restful.dtcc.repository;

import com.restful.dtcc.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepository extends JpaRepository<Family, Long> {

    Family findByFamilyId(Long familyId);

}

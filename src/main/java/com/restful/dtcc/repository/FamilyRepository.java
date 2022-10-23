package com.restful.dtcc.repository;

import com.restful.dtcc.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FamilyRepository extends JpaRepository<Family, Long> {

    //@Query(value = "SELECT FAMILY_ID as \"family_id\", FAMILY_NAME as \"family_name\", FAMILY_DESCRIPTION as \"family_description\" FROM FAMILY WHERE FAMILY_ID = ?", nativeQuery = true)
    Family findByFamilyId(Long familyId);

}

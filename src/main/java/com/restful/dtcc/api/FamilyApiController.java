package com.restful.dtcc.api;

import com.restful.dtcc.repository.FamilyRepository;
import com.restful.dtcc.entity.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//@RequestMapping("/api")
//public class FamilyApiController implements FamilyApi {
//
//    @Autowired
//    FamilyRepository familyRepository;
//
//    public ResponseEntity<Family> getFamilyById(Long familyId) {
//        return new ResponseEntity<>(familyRepository.findByFamilyId(familyId), HttpStatus.OK);
//    }
//
//}

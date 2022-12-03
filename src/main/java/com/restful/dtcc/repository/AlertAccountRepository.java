package com.restful.dtcc.repository;

import com.restful.dtcc.entity.AlertAccount;
import com.restful.dtcc.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AlertAccountRepository extends JpaRepository<AlertAccount, Long> {

    AlertAccount findByAccountId(Long accountId);

    List<AlertAccount> findByOrganizationIn(List<Organization> organizations);

}

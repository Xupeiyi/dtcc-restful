package com.restful.dtcc.repository;

import com.restful.dtcc.entity.AlertAccount;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AlertAccountRepository extends JpaRepository<AlertAccount, Long> {

    AlertAccount findByAccountId(Long accountId);


}

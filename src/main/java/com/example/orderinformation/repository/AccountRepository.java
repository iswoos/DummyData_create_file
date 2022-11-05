package com.example.orderinformation.repository;

import com.example.orderinformation.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}

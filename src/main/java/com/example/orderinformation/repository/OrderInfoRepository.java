package com.example.orderinformation.repository;

import com.example.orderinformation.domain.Account;
import com.example.orderinformation.domain.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> {

    @Query("select a, o " +
            "from OrderInfo o " +
            "   left join Account a " +
            "where o.id = :id and o.id = a.id")
    List<Account> findOneSameAccountId(@Param(value = "id") Long id);
}

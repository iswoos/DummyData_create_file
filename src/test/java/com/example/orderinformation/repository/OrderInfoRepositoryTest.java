package com.example.orderinformation.repository;

import com.example.orderinformation.domain.Account;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderInfoRepositoryTest {

    @Autowired
    OrderInfoRepository orderInfoRepository;

    @Test
    void findOneSameAccountId() {
        // given
        List<Account> findAccounts = orderInfoRepository.findOneSameAccountId(19L);

        // when
        for (Account account : findAccounts) {
            System.out.println("account = " + account);
        }

        // then
        Assertions.assertThat(findAccounts.size()).isEqualTo(3);

    }
}
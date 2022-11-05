package com.example.orderinformation.repository;

import com.example.orderinformation.domain.Account;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void findMember() throws Exception {
        // given
        List<Account> lists = accountRepository.findAll();

        // when
        for (Account list : lists) {
            System.out.println("list = " + list);
        }

        // then
        assertThat(lists.size()).isEqualTo(100);
    }

}
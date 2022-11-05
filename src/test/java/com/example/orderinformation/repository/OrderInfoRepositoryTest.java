package com.example.orderinformation.repository;

import com.example.orderinformation.domain.Account;
import com.example.orderinformation.domain.OrderInfo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderInfoRepositoryTest {

    @Autowired
    OrderInfoRepository orderInfoRepository;

    @Autowired
    AccountRepository accountRepository;

    @Test
    void findOneSameAccountId() {
        // given
        List<Account> findAccounts = orderInfoRepository.findOneSameAccountId(19L);

        // when
        for (Account account : findAccounts) {
            System.out.println("account = " + account);
        }

        // then
        assertThat(findAccounts.size()).isEqualTo(3);

    }

    @Test
    public void save() throws Exception {
        for (int i = 0; i < 200; i++) {
            int random = (int) (Math.random() * 100) + 1;
            Account account = accountRepository.findById((long) random).get();

            int val = (int) (Math.random() * 1000000) + 100;
            orderInfoRepository.save(new OrderInfo(account, (long) val));
        }
        List<OrderInfo> orders = orderInfoRepository.findAll();
        for (OrderInfo order : orders) {
            System.out.println("order = " + order);
        }
    }

    @Test
    public void saveOne() throws Exception {
        OrderInfo orderInfo = new OrderInfo(accountRepository.findById(52L).get(), 40000L);
        orderInfoRepository.save(orderInfo);

        OrderInfo findOrderInfo = orderInfoRepository.findById(orderInfo.getId()).get();
        System.out.println("findOrderInfo = " + findOrderInfo);

        assertThat(orderInfo.getId()).isEqualTo(findOrderInfo.getId());
    }

    @Test
    public void findAll() throws Exception {
        List<OrderInfo> orders = orderInfoRepository.findAll();
        for (OrderInfo order : orders) {
            System.out.println("order = " + order);
        }
    }

    @Test
    public void findOne() throws Exception {
        OrderInfo orderInfo = orderInfoRepository.findById(50L).get();
        System.out.println("orderInfo = " + orderInfo);
    }
}
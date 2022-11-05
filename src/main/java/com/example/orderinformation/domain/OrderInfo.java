package com.example.orderinformation.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

//@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderInfo {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "account_id")
    private Long accountId;

    private Long orderPrice;

    @CreatedDate
    private LocalDateTime createdAt;

    public OrderInfo(Long productId, Long accountId, Long orderPrice) {
        this.productId = productId;
        this.accountId = accountId;
        this.orderPrice = orderPrice;
    }
}

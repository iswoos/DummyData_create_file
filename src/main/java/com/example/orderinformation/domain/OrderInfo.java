package com.example.orderinformation.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "order_info")
public class OrderInfo {
    @Id @GeneratedValue
    private Long id;

//    @Column(name = "product_id")
//    private Long productId;

    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "order_price")
    private Long orderPrice;

//    @CreatedDate
    private LocalDateTime createdAt;

    public OrderInfo(Long accountId, Long orderPrice, LocalDateTime createdAt) {
        this.accountId = accountId;
        this.orderPrice = orderPrice;
        this.createdAt = createdAt;
    }
}

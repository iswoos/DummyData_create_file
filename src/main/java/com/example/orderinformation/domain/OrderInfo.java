package com.example.orderinformation.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Table(name = "order_info")
@EntityListeners(AuditingEntityListener.class)
public class OrderInfo {
    @Id @GeneratedValue
    private Long id;

//    @Column(name = "product_id")
//    private Long productId;

//    @Column(name = "account_id")
//    private Long accountId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(name = "order_price")
    private Long orderPrice;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

//    public OrderInfo(Long accountId, Long orderPrice, LocalDateTime createdAt) {
//        this.accountId = accountId;
//        this.orderPrice = orderPrice;
//        this.createdAt = createdAt;
//    }

    public OrderInfo(Account account, Long orderPrice) {
        this.account = account;
        this.orderPrice = orderPrice;
    }
}

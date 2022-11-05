package com.example.orderinformation.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "account_id")
    private Long id;

    private String productName;

    private String seller;

    private Long price;

    public Product(String productName, String seller, Long price) {
        this.productName = productName;
        this.seller = seller;
        this.price = price;
    }
}

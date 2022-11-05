package com.example.orderinformation.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Account {

    @Id @GeneratedValue
    @Column(name = "account_id")
    private Long id;
}

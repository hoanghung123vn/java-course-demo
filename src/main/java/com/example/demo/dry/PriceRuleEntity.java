package com.example.demo.dry;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "price_rules")
public class PriceRuleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String discountCode;
    private String type;
    private BigDecimal amount;
    private Date startAt;
    private Date endAt;
    private Date createdAt;
    private Date updatedAt;
}

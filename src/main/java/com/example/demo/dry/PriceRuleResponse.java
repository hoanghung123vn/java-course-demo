package com.example.demo.dry;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Setter
@Getter
public class PriceRuleResponse {
    private int id;
    private String discountCode;
    private String type;
    private BigDecimal amount;
    private Date startAt;
    private Date endAt;
    private Date createdAt;
    private Date updatedAt;
}

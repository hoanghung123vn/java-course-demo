package com.example.demo.dry;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Optional;

@Getter
@Setter
public class PriceRuleRequest {
    private int id;
    private String discountCode;
    private String type;
    private BigDecimal amount;
    private Date startAt;
    private Optional<Date> endAt;
}

package com.example.demo.dry;

import java.util.List;

public interface PriceRuleService {
    List<PriceRuleResponse> findAll();

    PriceRuleResponse create(PriceRuleRequest request);

    PriceRuleResponse update(PriceRuleRequest request);
}

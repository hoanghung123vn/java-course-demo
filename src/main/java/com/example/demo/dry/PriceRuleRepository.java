package com.example.demo.dry;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PriceRuleRepository extends CrudRepository<PriceRuleEntity, Integer> {
    List<PriceRuleEntity> findAll();
}

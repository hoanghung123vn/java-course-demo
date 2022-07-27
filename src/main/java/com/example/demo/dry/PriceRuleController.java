package com.example.demo.dry;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/price-rules")
@AllArgsConstructor
public class PriceRuleController {
    private final PriceRuleService priceRuleService;

    @GetMapping
    public List<PriceRuleResponse> findAll() {
        return priceRuleService.findAll();
    }

    @PostMapping
    public PriceRuleResponse create(@Valid @RequestBody PriceRuleRequest request) {
        return priceRuleService.create(request);
    }

    @PutMapping
    public PriceRuleResponse update(@Valid @RequestBody PriceRuleRequest request) {
        return priceRuleService.update(request);
    }
}

package com.example.demo.dry;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PriceRuleServiceImpl implements PriceRuleService {
    private final PriceRuleRepository priceRuleRepository;
    private final PriceRuleMapper priceRuleMapper;

    @Override
    public List<PriceRuleResponse> findAll() {
        var priceRules = priceRuleRepository.findAll();
        return priceRules.stream().map(priceRuleMapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public PriceRuleResponse create(PriceRuleRequest request) {
        var priceRule = priceRuleMapper.toEntity(request);
        priceRuleRepository.save(priceRule);
        return priceRuleMapper.toResponse(priceRule);
    }

    @Override
    public PriceRuleResponse update(PriceRuleRequest request, int id) {
        var priceRule = priceRuleRepository.findById(id).orElseThrow(RuntimeException::new);
        priceRuleMapper.updateEntity(request, priceRule);
        priceRuleRepository.save(priceRule);
        return priceRuleMapper.toResponse(priceRule);
    }
}

package com.example.demo.dry;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface PriceRuleMapper {
    PriceRuleResponse toResponse(PriceRuleEntity entity);

    PriceRuleEntity toEntity(PriceRuleRequest request);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(PriceRuleRequest request, @MappingTarget PriceRuleEntity entity);
}

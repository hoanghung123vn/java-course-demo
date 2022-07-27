package com.example.demo.dry;

import org.mapstruct.*;

import java.util.Optional;
import java.sql.Date;

@Mapper(componentModel = "spring")
public abstract class PriceRuleMapper {
    abstract PriceRuleResponse toResponse(PriceRuleEntity entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "endAt", target = "endAt", qualifiedByName = "endAt")
    abstract PriceRuleEntity toEntity(PriceRuleRequest request);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "endAt", target = "endAt", qualifiedByName = "endAt")
    abstract void updateEntity(PriceRuleRequest request, @MappingTarget PriceRuleEntity entity);

    @Named("endAt")
    public Date endAt(Optional<Date> endAt) {
        return endAt.orElse(null);
    }
}

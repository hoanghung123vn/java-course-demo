package com.example.demo.annotation;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDto entityToDto(CustomerEntity entity);
}

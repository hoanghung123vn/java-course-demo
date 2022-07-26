package com.example.demo.annotation;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CustomerDto {
    @NotNull
    private String name;
    private String phone;

    @Init
    public void init() {
        this.name = "test";
        this.phone = "0313123123";
    }
}

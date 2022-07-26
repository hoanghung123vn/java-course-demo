package com.example.demo.hibernate_validator;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class User {
    @Id
    private String id;
    @NotNull
    private String userName;
}

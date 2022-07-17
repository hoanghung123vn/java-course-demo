package com.example.demo.solid.interface_segregation;

import java.util.List;

public interface CrudRepository {
    Object save(Object object);

    List<Object> findAll();

    Object findById(int id);

    Object delete(Object object);
}

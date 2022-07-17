package com.example.demo.solid.interface_segregation;

import java.util.List;

public interface Repository {
    Object save(Object object);

    List<Object> findAll();

    Object findById(int id);

    Object delete(Object object);

    List<Object> findAll(Sort sort);

    List<Object> findAll(Pageable pageable);
}

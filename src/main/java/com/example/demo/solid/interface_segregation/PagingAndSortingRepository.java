package com.example.demo.solid.interface_segregation;

import java.util.List;

public interface PagingAndSortingRepository extends CrudRepository {

    List<Object> findAll(Sort sort);

    List<Object> findAll(Pageable pageable);
}

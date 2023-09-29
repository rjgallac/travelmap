package com.example.demo.repository;

import com.example.demo.model.Marker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkerRepository extends CrudRepository<Marker, Long> {
}

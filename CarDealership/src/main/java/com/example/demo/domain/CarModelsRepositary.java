package com.example.demo.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarModelsRepositary extends CrudRepository<CarModels, Long> {
List<CarModels> findByMake(String make);
}

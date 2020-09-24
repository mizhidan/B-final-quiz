package com.example.demo.repository;

import com.example.demo.dto.TraineeDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraineeRepository extends CrudRepository<TraineeDto, Integer> {

    @Override
    List<TraineeDto> findAll();
}

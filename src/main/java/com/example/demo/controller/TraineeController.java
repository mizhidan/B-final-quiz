package com.example.demo.controller;

import com.example.demo.dto.TraineeDto;
import com.example.demo.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TraineeController {
    @Autowired
    TraineeService traineeService;

    @CrossOrigin
    @GetMapping("/students")
    public List<TraineeDto> getStudentList() {
        return traineeService.getTraineeList();
    }

}

package com.iftm.producer.controllers;

import com.iftm.producer.models.dtos.AnnualWageDTO;
import com.iftm.producer.models.dtos.EmployeeDTO;
import com.iftm.producer.services.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ResponseController {

    @Autowired
    private ResponseService service;

    @GetMapping("/response")
    public ResponseEntity<AnnualWageDTO> getResponse(@RequestBody EmployeeDTO employee) {
        return service.calculateAnnualWage(employee);
    }
}

package com.iftm.producer.services;

import com.iftm.producer.models.dtos.AnnualWageDTO;
import com.iftm.producer.models.dtos.EmployeeDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ResponseService {

    @Value("${eureka.instance.instance-id:}")
    private String instanceId;

    public ResponseEntity<AnnualWageDTO> calculateAnnualWage(EmployeeDTO employee) {
        return ResponseEntity.ok().body(
                new AnnualWageDTO(
                        employee.getFirstName(),
                        (employee.getWage() * 12)));
    }
}

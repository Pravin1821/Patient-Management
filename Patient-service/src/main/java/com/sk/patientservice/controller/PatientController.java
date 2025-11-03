package com.sk.patientservice.controller;

import com.sk.patientservice.service.PatientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    public final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


}

package com.sk.patientservice.mapper;

import com.sk.patientservice.dto.PatientResponseDTO;
import com.sk.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient p){
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(p.getId().toString());
        patientDTO.setName(p.getName());
        patientDTO.setAddress(p.getAddress());
        patientDTO.setEmail(p.getEmail());
        patientDTO.setDateOfBirth(p.getBirthDate().toString());

        return patientDTO;
    }
}

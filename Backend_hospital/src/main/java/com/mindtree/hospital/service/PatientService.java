package com.mindtree.hospital.service;

import com.mindtree.hospital.domain.Patient;
import com.mindtree.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient getPatientById(Integer id){
        return patientRepository.findById(id).orElse(null);
    }

    public Iterable<Patient> getPatientList(){
        return patientRepository.findAll();
    }

}

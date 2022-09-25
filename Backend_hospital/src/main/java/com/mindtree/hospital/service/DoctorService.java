package com.mindtree.hospital.service;

import com.mindtree.hospital.domain.Doctor;
import com.mindtree.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor addDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    public Doctor getDoctorById(Integer id){
        return doctorRepository.findById(id).get();
    }

    public Iterable<Doctor> getDoctorList(){
        return doctorRepository.findAll();
    }
}

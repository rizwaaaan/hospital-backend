package com.mindtree.hospital.repository;

import com.mindtree.hospital.domain.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient,Integer> {

}

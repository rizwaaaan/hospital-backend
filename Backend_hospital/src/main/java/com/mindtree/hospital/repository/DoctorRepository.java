package com.mindtree.hospital.repository;
import org.springframework.data.repository.CrudRepository;
import com.mindtree.hospital.domain.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor,Integer>{

}

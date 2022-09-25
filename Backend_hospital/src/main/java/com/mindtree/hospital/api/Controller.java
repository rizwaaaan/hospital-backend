package com.mindtree.hospital.api;


import com.mindtree.hospital.domain.Doctor;
import com.mindtree.hospital.domain.Patient;
import com.mindtree.hospital.service.DoctorService;
import com.mindtree.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

    public final DoctorService doctorService;
    public final PatientService patientService;

    @Autowired
    public Controller(DoctorService doctorService, PatientService patientService) {
        this.doctorService = doctorService;
        this.patientService = patientService;
    }

    @GetMapping("/ping")
    String getPong() {
        return "pong";
    }

    @GetMapping("/doctor")
    Doctor getDoctor(@RequestParam(name = "id", required = true) Integer id){
        return doctorService.getDoctorById(id);
    }

    @GetMapping("/doctorList")
    Iterable<Doctor> getDoctorList(){
        return doctorService.getDoctorList();
    }

    @GetMapping("/patient")
    Patient getPatient(@RequestParam(name = "id", required = true) Integer id){
        return patientService.getPatientById(id);
    }

    @PostMapping("/doctor")
    @ResponseBody
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(doctorService.addDoctor(doctor));
    }

    @PostMapping("/patient")
    @ResponseBody
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(patientService.addPatient(patient));
    }

}

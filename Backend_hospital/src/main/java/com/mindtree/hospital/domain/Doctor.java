package com.mindtree.hospital.domain;

import javax.persistence.*;

@Entity(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private String gender;
    @Column (name= "specialization_field", nullable = false)
    private String specializationField;
    @Column (name= "number_of_patient_attended", nullable = false)
    private Integer numberOfPatientAttended;

    public Doctor() {
    }

    public Doctor(Integer id, String name, Integer age, String gender, String specializationField, Integer numberOfPatientAttended) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.specializationField = specializationField;
        this.numberOfPatientAttended = numberOfPatientAttended;
    }

    public Doctor(String name, Integer age, String gender, String specializationField, Integer numberOfPatientAttended) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.specializationField = specializationField;
        this.numberOfPatientAttended = numberOfPatientAttended;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getSpecializationField() {
        return specializationField;
    }

    public Integer getNumberOfPatientAttended() {
        return numberOfPatientAttended;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSpecializationField(String specializationField) {
        this.specializationField = specializationField;
    }

    public void setNumberOfPatientAttended(Integer numberOfPatientAttended) {
        this.numberOfPatientAttended = numberOfPatientAttended;
    }
}

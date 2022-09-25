package com.mindtree.hospital.domain;

import javax.persistence.*;

@Entity(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private String gender;
    @Column (name= "visited_doctor_name")
    private String visitedDoctorName;
    @Column (name= "date_of_visit")
    private String dateOfVisit;
    @Column
    private String prescription;

    public Patient() {
    }

    public Patient(Integer id, String name, Integer age, String gender, String visitedDoctorName, String dateOfVisit, String prescription) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.visitedDoctorName = visitedDoctorName;
        this.dateOfVisit = dateOfVisit;
        this.prescription = prescription;
    }

    public Patient(String name, Integer age, String gender, String visitedDoctorName, String dateOfVisit, String prescription) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.visitedDoctorName = visitedDoctorName;
        this.dateOfVisit = dateOfVisit;
        this.prescription = prescription;
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

    public String getVisitedDoctorName() {
        return visitedDoctorName;
    }

    public String getDateOfVisit() {
        return dateOfVisit;
    }

    public String getPrescription() {
        return prescription;
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

    public void setVisitedDoctorName(String visitedDoctorName) {
        this.visitedDoctorName = visitedDoctorName;
    }

    public void setDateOfVisit(String dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}

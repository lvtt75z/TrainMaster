package com.example.springmvc.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "fitness_manager")
public class FitnessManager {
    @Id
    @Column(name = "FM_ID")
    private int fmId;

    @Column(name = "FirstName", length = 50)
    private String firstName;

    @Column(name = "LastName", length = 50)
    private String lastName;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "BirthDate")
    private Date birthDate;

    @Column(name = "Phone", length = 15)
    private String phone;

    @Column(name = "Email",length = 50)
    private String email;

    @Column(name = "Address", length = 255)
    private String address;

    @Column(name = "Report", columnDefinition = "TEXT")
    private String report;

    //Relationship for All table

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id")
    @JsonBackReference
    private Owner owner;

    @OneToOne
    @JoinColumn(name = "account_id")
    @JsonIgnore
    private Account account;

    @OneToMany(mappedBy = "fitnessManager", cascade = CascadeType.ALL)
    private List<PersonalTrainer> personalTrainer;

    public FitnessManager() {
    }

    public FitnessManager(int fmId, String firstName, String lastName, String gender, Date birthDate, String phone, String email, String address, String report,Owner owner,Account account) {
        this.fmId = fmId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.report = report;
        this.owner = owner;
        this.account = account;
    }

    public int getFmId() {
        return fmId;
    }

    public void setFmId(int fmId) {
        this.fmId = fmId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

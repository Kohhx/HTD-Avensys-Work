package com.project.EmployeeApplication.employee;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( updatable = false)
    private int id;

    @NotEmpty(message = "First name cannot be empty")
    @Column(name="first_name",nullable = false)
    private String firstName;

    @NotEmpty(message = "Last name cannot be empty")
    @Column(name="last_name",nullable = false)
    private String lastName;

    @NotEmpty(message = "Gender cannot be empty")
    @Column(name="gender",nullable = false)
    private String gender;

    @Column(name="profile_url")
    private String profileUrl;

    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email cannot be empty")
    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Min(value = 10, message = "Age should not be less than 10")
    @Max(value = 100, message = "Age should not be greater than 100")
    @Column(name="age", nullable = false)
    private int age;

    @Size(min = 5, max = 200, message
            = "Address between 5 and 200 characters")
    @NotNull(message = "Address cannot be empty")
    @Column(name="address", nullable = false)
    private String address;

    public Employee() {
    }

    public Employee( String firstName, String lastName, String gender, String profileUrl, String email, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.profileUrl = profileUrl;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public Employee(int id, String firstName, String lastName, String gender, String profileUrl, String email, int age, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.profileUrl = profileUrl;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", profileUrl='" + profileUrl + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

package com.apps.SpringWebEc2.dto;

import java.time.LocalDate;

public class EmployeeDto {
    private String name;
    private String email;
    private String phone;
    private String department;
    private LocalDate startDate;

    // Constructors
    public EmployeeDto() {}

    public EmployeeDto(String name, String email, String phone, String department, LocalDate startDate) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.startDate = startDate;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}


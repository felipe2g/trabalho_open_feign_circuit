package com.iftm.startexample.models.dtos;

import java.util.Objects;

public class AnnualWageDTO {
    private String firstName;
    private Double annualWage;

    public AnnualWageDTO() {
    }

    public AnnualWageDTO(String firstName, Double annualWage) {
        this.firstName = firstName;
        this.annualWage = annualWage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getAnnualWage() {
        return annualWage;
    }

    public void setAnnualWage(Double annualWage) {
        this.annualWage = annualWage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnnualWageDTO that = (AnnualWageDTO) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(annualWage, that.annualWage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, annualWage);
    }

    @Override
    public String toString() {
        return "AnnualWageDTO{" +
                "firstName='" + firstName + '\'' +
                ", annualWage='" + annualWage + '\'' +
                '}';
    }
}

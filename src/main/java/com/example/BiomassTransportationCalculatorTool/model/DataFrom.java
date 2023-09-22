package com.example.BiomassTransportationCalculatorTool.model;

public class DataFrom {
    // Input Fields
    private Double yieldPerAcre;
    private Double truckCapacity;
    private Double tripLength;
    private Double fuelEconomy;
    private Double interestRate;
    private Double labor;
    private Double fuel;
    private Double repairs;
    private Double loadTime;
    private Double unloadTime;
    private Double idlingTime;
    private Double idlingFuelUse;
    private Double loadedSpeed;
    private Double unloadedSpeed;
    private Double purchase;
    private Double sales;
    private Double yearsOfUse;
    private Double annualHoursOfUse;

    // Output Fields
    private Double tripsPerAcre;
    private Double tripDuration;
    private Double interestPerHour;
    private Double depreciation;
    private Double depreciationPerYear;
    private Double depreciationPerHour;
    private Double costPerAcre;
    private Double costPerTon;

    @Override
    public String toString() {
        return "DataFrom{" +
                "yieldPerAcre=" + yieldPerAcre +
                ", truckCapacity=" + truckCapacity +
                ", tripLength=" + tripLength +
                ", fuelEconomy=" + fuelEconomy +
                ", interestRate=" + interestRate +
                ", labor=" + labor +
                ", fuel=" + fuel +
                ", repairs=" + repairs +
                ", loadTime=" + loadTime +
                ", unloadTime=" + unloadTime +
                ", idlingTime=" + idlingTime +
                ", idlingFuelUse=" + idlingFuelUse +
                ", loadedSpeed=" + loadedSpeed +
                ", unloadedSpeed=" + unloadedSpeed +
                ", purchase=" + purchase +
                ", sales=" + sales +
                ", yearsOfUse=" + yearsOfUse +
                ", annualHoursOfUse=" + annualHoursOfUse +
                ", tripsPerAcre=" + tripsPerAcre +
                ", tripDuration=" + tripDuration +
                ", interestPerHour=" + interestPerHour +
                ", depreciation=" + depreciation +
                ", depreciationPerYear=" + depreciationPerYear +
                ", depreciationPerHour=" + depreciationPerHour +
                ", costPerAcre=" + costPerAcre +
                ", costPerTon=" + costPerTon +
                '}';
    }

    public Double getYieldPerAcre() {
        return yieldPerAcre;
    }

    public void setYieldPerAcre(Double yieldPerAcre) {
        this.yieldPerAcre = yieldPerAcre;
    }

    public Double getTruckCapacity() {
        return truckCapacity;
    }

    public void setTruckCapacity(Double truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    public Double getTripLength() {
        return tripLength;
    }

    public void setTripLength(Double tripLength) {
        this.tripLength = tripLength;
    }

    public Double getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(Double fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getLabor() {
        return labor;
    }

    public void setLabor(Double labor) {
        this.labor = labor;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public Double getRepairs() {
        return repairs;
    }

    public void setRepairs(Double repairs) {
        this.repairs = repairs;
    }

    public Double getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Double loadTime) {
        this.loadTime = loadTime;
    }

    public Double getUnloadTime() {
        return unloadTime;
    }

    public void setUnloadTime(Double unloadTime) {
        this.unloadTime = unloadTime;
    }

    public Double getIdlingTime() {
        return idlingTime;
    }

    public void setIdlingTime(Double idlingTime) {
        this.idlingTime = idlingTime;
    }

    public Double getIdlingFuelUse() {
        return idlingFuelUse;
    }

    public void setIdlingFuelUse(Double idlingFuelUse) {
        this.idlingFuelUse = idlingFuelUse;
    }

    public Double getLoadedSpeed() {
        return loadedSpeed;
    }

    public void setLoadedSpeed(Double loadedSpeed) {
        this.loadedSpeed = loadedSpeed;
    }

    public Double getUnloadedSpeed() {
        return unloadedSpeed;
    }

    public void setUnloadedSpeed(Double unloadedSpeed) {
        this.unloadedSpeed = unloadedSpeed;
    }

    public Double getPurchase() {
        return purchase;
    }

    public void setPurchase(Double purchase) {
        this.purchase = purchase;
    }

    public Double getSales() {
        return sales;
    }

    public void setSales(Double sales) {
        this.sales = sales;
    }

    public Double getYearsOfUse() {
        return yearsOfUse;
    }

    public void setYearsOfUse(Double yearsOfUse) {
        this.yearsOfUse = yearsOfUse;
    }

    public Double getAnnualHoursOfUse() {
        return annualHoursOfUse;
    }

    public void setAnnualHoursOfUse(Double annualHoursOfUse) {
        this.annualHoursOfUse = annualHoursOfUse;
    }

    public Double getTripsPerAcre() {
        return tripsPerAcre;
    }

    public void setTripsPerAcre(Double tripsPerAcre) {
        this.tripsPerAcre = tripsPerAcre;
    }

    public Double getTripDuration() {
        return tripDuration;
    }

    public void setTripDuration(Double tripDuration) {
        this.tripDuration = tripDuration;
    }

    public Double getInterestPerHour() {
        return interestPerHour;
    }

    public void setInterestPerHour(Double interestPerHour) {
        this.interestPerHour = interestPerHour;
    }

    public Double getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(Double depreciation) {
        this.depreciation = depreciation;
    }

    public Double getDepreciationPerYear() {
        return depreciationPerYear;
    }

    public void setDepreciationPerYear(Double depreciationPerYear) {
        this.depreciationPerYear = depreciationPerYear;
    }

    public Double getDepreciationPerHour() {
        return depreciationPerHour;
    }

    public void setDepreciationPerHour(Double depreciationPerHour) {
        this.depreciationPerHour = depreciationPerHour;
    }

    public Double getCostPerAcre() {
        return costPerAcre;
    }

    public void setCostPerAcre(Double costPerAcre) {
        this.costPerAcre = costPerAcre;
    }

    public Double getCostPerTon() {
        return costPerTon;
    }

    public void setCostPerTon(Double costPerTon) {
        this.costPerTon = costPerTon;
    }
}

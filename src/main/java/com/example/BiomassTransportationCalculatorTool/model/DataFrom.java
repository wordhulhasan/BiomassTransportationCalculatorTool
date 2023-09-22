package com.example.BiomassTransportationCalculatorTool.model;

public class DataFrom {
    // Input Fields
    private double yieldPerAcre;
    private double truckCapacity;
    private double tripLength;
    private double fuelEconomy;
    private double interestRate;
    private double labor;
    private double fuel;
    private double repairs;
    private double loadTime;
    private double unloadTime;
    private double idlingTime;
    private double idlingFuelUse;
    private double loadedSpeed;
    private double unloadedSpeed;
    private double purchase;
    private double sales;
    private double yearsOfUse;
    private double annualHoursOfUse;

    // Output Fields
    private double tripsPerAcre;
    private double tripDuration;
    private double interestPerHour;
    private double depreciationPerYear;
    private double depreciationPerHour;
    private double costPerAcre;
    private double costPerTon;

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
                ", depreciationPerYear=" + depreciationPerYear +
                ", depreciationPerHour=" + depreciationPerHour +
                ", costPerAcre=" + costPerAcre +
                ", costPerTon=" + costPerTon +
                '}';
    }

    public double getTripsPerAcre() {
        return tripsPerAcre;
    }

    public void setTripsPerAcre(double tripsPerAcre) {
        this.tripsPerAcre = tripsPerAcre;
    }

    public double getTripDuration() {
        return tripDuration;
    }

    public void setTripDuration(double tripDuration) {
        this.tripDuration = tripDuration;
    }

    public double getInterestPerHour() {
        return interestPerHour;
    }

    public void setInterestPerHour(double interestPerHour) {
        this.interestPerHour = interestPerHour;
    }

    public double getDepreciationPerYear() {
        return depreciationPerYear;
    }

    public void setDepreciationPerYear(double depreciationPerYear) {
        this.depreciationPerYear = depreciationPerYear;
    }

    public double getDepreciationPerHour() {
        return depreciationPerHour;
    }

    public void setDepreciationPerHour(double depreciationPerHour) {
        this.depreciationPerHour = depreciationPerHour;
    }

    public double getCostPerAcre() {
        return costPerAcre;
    }

    public void setCostPerAcre(double costPerAcre) {
        this.costPerAcre = costPerAcre;
    }

    public double getCostPerTon() {
        return costPerTon;
    }

    public void setCostPerTon(double costPerTon) {
        this.costPerTon = costPerTon;
    }

    public double getYieldPerAcre() {
        return yieldPerAcre;
    }

    public void setYieldPerAcre(double yieldPerAcre) {
        this.yieldPerAcre = yieldPerAcre;
    }

    public double getTruckCapacity() {
        return truckCapacity;
    }

    public void setTruckCapacity(double truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    public double getTripLength() {
        return tripLength;
    }

    public void setTripLength(double tripLength) {
        this.tripLength = tripLength;
    }

    public double getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(double fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getLabor() {
        return labor;
    }

    public void setLabor(double labor) {
        this.labor = labor;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getRepairs() {
        return repairs;
    }

    public void setRepairs(double repairs) {
        this.repairs = repairs;
    }

    public double getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(double loadTime) {
        this.loadTime = loadTime;
    }

    public double getUnloadTime() {
        return unloadTime;
    }

    public void setUnloadTime(double unloadTime) {
        this.unloadTime = unloadTime;
    }

    public double getIdlingTime() {
        return idlingTime;
    }

    public void setIdlingTime(double idlingTime) {
        this.idlingTime = idlingTime;
    }

    public double getIdlingFuelUse() {
        return idlingFuelUse;
    }

    public void setIdlingFuelUse(double idlingFuelUse) {
        this.idlingFuelUse = idlingFuelUse;
    }

    public double getLoadedSpeed() {
        return loadedSpeed;
    }

    public void setLoadedSpeed(double loadedSpeed) {
        this.loadedSpeed = loadedSpeed;
    }

    public double getUnloadedSpeed() {
        return unloadedSpeed;
    }

    public void setUnloadedSpeed(double unloadedSpeed) {
        this.unloadedSpeed = unloadedSpeed;
    }

    public double getPurchase() {
        return purchase;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getYearsOfUse() {
        return yearsOfUse;
    }

    public void setYearsOfUse(double yearsOfUse) {
        this.yearsOfUse = yearsOfUse;
    }

    public double getAnnualHoursOfUse() {
        return annualHoursOfUse;
    }

    public void setAnnualHoursOfUse(double annualHoursOfUse) {
        this.annualHoursOfUse = annualHoursOfUse;
    }

}

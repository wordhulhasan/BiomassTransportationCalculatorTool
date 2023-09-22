package com.example.BiomassTransportationCalculatorTool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.BiomassTransportationCalculatorTool.model.DataFrom;

import javax.xml.crypto.Data;

@Controller
public class SiteViewController {

    @GetMapping("/")
    public String formData(Model model) {
        model.addAttribute("dataForm", new DataFrom());
        return "home";
    }

    @PostMapping("/processForm")
    public String processData(@ModelAttribute DataFrom dataForm, Model model) {
        // Call backend API
        DataFrom responseData = callApi(dataForm);
        model.addAttribute("dataForm", responseData);
        return "home";
    }

    public double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
    private DataFrom callApi(DataFrom dataForm) {
        System.out.println("API Call Started with the following data : "+dataForm.toString());
        // Logic to call the API and set output fields.
        // Calculations stored in variables
        Double tripsPerAcreValue = dataForm.getYieldPerAcre() / dataForm.getTruckCapacity();
        Double tripDurationValue = dataForm.getLoadTime() + dataForm.getUnloadTime() + dataForm.getIdlingTime() + (dataForm.getTripLength() / dataForm.getLoadedSpeed()) + (dataForm.getTripLength() / dataForm.getUnloadedSpeed());
        Double interestPerHourValue = (dataForm.getPurchase() * dataForm.getInterestRate()) / 150 / 100;
        Double depreciationValue = dataForm.getPurchase() - dataForm.getSales();
        Double depreciationPerYearValue = depreciationValue / dataForm.getYearsOfUse();
        Double depreciationPerHourValue = depreciationPerYearValue / dataForm.getAnnualHoursOfUse();
        Double costPerAcreValue = tripsPerAcreValue * ((dataForm.getLabor() + dataForm.getRepairs() + interestPerHourValue + depreciationPerHourValue) * tripDurationValue
                + dataForm.getTripLength() / dataForm.getFuelEconomy() * 2 * dataForm.getFuel() + dataForm.getIdlingTime() * dataForm.getIdlingFuelUse() * dataForm.getFuel());
        Double costPerTonValue = costPerAcreValue / dataForm.getYieldPerAcre();

        // Setting the computed values to the properties of dataForm
        dataForm.setTripsPerAcre(roundToTwoDecimals(tripsPerAcreValue));
        dataForm.setTripDuration(roundToTwoDecimals(tripDurationValue));
        dataForm.setInterestPerHour(roundToTwoDecimals(interestPerHourValue));
        dataForm.setDepreciation(roundToTwoDecimals(depreciationValue));
        dataForm.setDepreciationPerYear(roundToTwoDecimals(depreciationPerYearValue));
        dataForm.setDepreciationPerHour(roundToTwoDecimals(depreciationPerHourValue));
        dataForm.setCostPerAcre(roundToTwoDecimals(costPerAcreValue));
        dataForm.setCostPerTon(roundToTwoDecimals(costPerTonValue));
        return dataForm; // This should be replaced with the processed response.
    }
}

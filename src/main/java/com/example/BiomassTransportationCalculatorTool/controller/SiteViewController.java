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

//    @GetMapping("/")
//    public String homePage(Model model) {
//        return "home";
//    }

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

    private DataFrom callApi(DataFrom dataForm) {
        System.out.println(dataForm.toString());
        // Logic to call the API and set output fields.
        if(dataForm.getTripLength()>100)
            dataForm.setTripDuration(120);
        else
            dataForm.setTripDuration(100);
        return dataForm; // This should be replaced with the processed response.
    }
}

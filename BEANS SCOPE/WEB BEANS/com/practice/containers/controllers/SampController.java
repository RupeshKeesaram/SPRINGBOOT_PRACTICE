package com.practice.containers.controllers;


import com.practice.containers.services.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class SampController {

    private final VehicleService vehicleService;

    @Autowired
    SampController(VehicleService vehicleService)
    {
        this.vehicleService = vehicleService;
    }

//    private static Logger log = LoggerFactory.getLogger(SampController.class);


    @GetMapping(value={"","/","/home"})
    public String displayHome(Model model)
    {
        model.addAttribute("username","Rupesh");
        vehicleService.samp();
        vehicleService.setCounter(vehicleService.getCounter()+1);
        log.info("No of times service bean is called "+vehicleService.getCounter());
        return "home.html";
    }
}

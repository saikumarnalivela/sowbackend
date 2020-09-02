package controllers;


import models.SowDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import services.SowService;

@RestController
public class SowController {

    @Autowired
    private SowService sowService;




    @PostMapping("/sowDetails")
    public String getSowDetails(@RequestBody SowDetails sowDetails){
        return sowService.savedetails(sowDetails);
    }
}

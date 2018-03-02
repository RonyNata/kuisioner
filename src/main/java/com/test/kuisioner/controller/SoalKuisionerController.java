package com.test.kuisioner.controller;

import com.test.kuisioner.service.Implement.SoalKuisionerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SoalKuisionerController {

    @Autowired
    private SoalKuisionerServiceImpl soalKuisionerService;

    @RequestMapping(value = "/get-kuisioner", method = RequestMethod.GET)
    ResponseEntity<?> getKuisioner() {
        return new ResponseEntity<Object>(soalKuisionerService.getSoal(), HttpStatus.OK);
    }

}

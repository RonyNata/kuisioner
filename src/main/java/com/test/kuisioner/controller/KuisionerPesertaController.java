package com.test.kuisioner.controller;

import com.test.kuisioner.model.KuisionerPeserta;
import com.test.kuisioner.service.Implement.KuisionerPesertaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KuisionerPesertaController {
    @Autowired
    private KuisionerPesertaServiceImpl kuisionerPesertaService;

    @RequestMapping(value = "/create-kuisioner-peserta", method = RequestMethod.POST)
    ResponseEntity<?> getKuisioner(@RequestBody KuisionerPeserta kuisionerPeserta) {
        kuisionerPesertaService.createKuisionerPeserta(kuisionerPeserta);
        return new ResponseEntity<Object>("Berhasil Disimpan", HttpStatus.OK);
    }
}

package com.example.proj1.controller;

import com.example.proj1.entity.Register;
import com.example.proj1.service.RegisterService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Log
@RestController
@RequestMapping("/register")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@Controller
public class RegisterController {
    @Autowired
    private RegisterService service;

    @PostMapping("/sameid")
    public ResponseEntity sameid(@RequestBody Register register) throws Exception {
        log.info("register id : " + register.getId());
        boolean TF = service.same(register);
        if(TF) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity(HttpStatus.OK);
        }
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody Register register) throws Exception {
        service.register(register);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Register register) throws Exception {
        String id = service.login(register);
        if(id == null) {
            return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<String>(id, HttpStatus.OK);
        }
    }

    @PostMapping("/findid")
    public ResponseEntity<String> findid(@RequestBody Register register) throws Exception {
        log.info("reg : " + register);
        String id = service.findid(register);
        log.info("id : " + id);
        if(id == null) {
            return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<String>(id, HttpStatus.OK);
        }
    }

    @PostMapping("/findpw")
    public ResponseEntity findpw(@RequestBody Register register) throws Exception {
        log.info("reg : " + register);
        boolean TF = service.findpw(register);
        log.info("TF : " + TF);
        if(TF) {
            return new ResponseEntity<String>(HttpStatus.OK);
        } else {
            return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping("/reset")
    public ResponseEntity reset(@RequestBody Register register) throws Exception {
        log.info("reg : " + register);
        service.reset(register);
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}

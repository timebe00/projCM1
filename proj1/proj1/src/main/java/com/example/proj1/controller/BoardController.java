package com.example.proj1.controller;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Log
@RestController
@RequestMapping("/board")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@Controller
public class BoardController {
    @Autowired
    private

    @PostMapping("/save")
    public ResponseEntity sameid(@RequestBody Board board) throws Exception {
        log.info("board : " + board);
        return null;
    }
}

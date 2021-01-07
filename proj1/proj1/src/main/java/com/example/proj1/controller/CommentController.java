package com.example.proj1.controller;

import com.example.proj1.entity.Comment;
import com.example.proj1.service.CommentService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Log
@RestController
@RequestMapping("/comment")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@Controller
public class CommentController {
    @Autowired
    private CommentService service;

    @PostMapping("/save")
    public ResponseEntity<Comment> save(@RequestBody Comment comment) throws Exception {
        log.info("comment : " + comment);
        Comment comment1 = service.input(comment);
        return new ResponseEntity<Comment>(comment1, HttpStatus.OK);
    }
}

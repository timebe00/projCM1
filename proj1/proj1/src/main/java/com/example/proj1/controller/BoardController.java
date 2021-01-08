package com.example.proj1.controller;

import lombok.extern.java.Log;
import com.example.proj1.entity.Board;
import com.example.proj1.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Log
@RestController
@RequestMapping("/board")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@Controller
public class BoardController {
    @Autowired
    private BoardService service;

    @PostMapping("/save")
    public ResponseEntity sameid(@RequestBody Board board) throws Exception {
        service.input(board);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/show")
    public ResponseEntity<List<Board>> showList() throws Exception {
        List<Board> list = service.showList();
        return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
    }

    @PostMapping("/showtxt")
    public ResponseEntity<HashMap<String, Object>> showtxt(@RequestBody Board board) throws Exception {
        HashMap<String, Object> has = service.showtxt(board);
        log.info("has : " + has);
        return new ResponseEntity<HashMap<String, Object>>(has, HttpStatus.OK);
    }
}
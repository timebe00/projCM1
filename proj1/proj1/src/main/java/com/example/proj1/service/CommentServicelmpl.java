package com.example.proj1.service;

import com.example.proj1.entity.Comment;
import com.example.proj1.repository.CommentRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Log
@Service
public class CommentServicelmpl implements CommentService {

    @Autowired
    private CommentRepository repository;

    @Override
    public Comment input(Comment comment) throws Exception {
        Comment comment1 = repository.save(comment);
        log.info("comment1 : " + comment1);
        return comment1;
    }
}

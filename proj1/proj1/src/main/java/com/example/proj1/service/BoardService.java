package com.example.proj1.service;

import com.example.proj1.entity.Board;

import java.util.HashMap;
import java.util.List;

public interface BoardService {
    public void input(Board board) throws Exception;
    public List<Board> showList() throws Exception;
    public HashMap<String, Object> showtxt(Board board) throws Exception;
}

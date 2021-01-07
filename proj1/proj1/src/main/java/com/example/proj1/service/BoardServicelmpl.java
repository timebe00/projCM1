package com.example.proj1.service;

import com.example.proj1.entity.Board;
import com.example.proj1.entity.Comment;
import com.example.proj1.entity.Register;
import com.example.proj1.repository.BoardRepository;
import com.example.proj1.repository.CommentRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Log
@Service
public class BoardServicelmpl implements BoardService{

    @Autowired
    private BoardRepository repository;

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public void input(Board board) throws Exception {
        repository.save(board);
    }

    @Override
    public List<Board> showList() throws Exception {
        return repository.findBy();
    }

    @Override
    public HashMap<String, Object> showtxt(Board board) throws Exception {
        Board list = repository.findByBoardNo(board.getBoardNo()).get(0);
        list.setViews(list.getViews()+1);
        repository.save(list);
        log.info("list.getBoardNo() : " + list.getBoardNo());
        List<Comment> comlist = commentRepository.findByBoardNo(list.getBoardNo());
        log.info("comlist : " + comlist);
        ArrayList<String> arrayListID = new ArrayList();
        ArrayList<String> arrayListTxt = new ArrayList();
        ArrayList<Long> arrayListComNo = new ArrayList<>();
        log.info("arrayListID.size() : " + arrayListID.size());
        for(int i = 0; i < comlist.size(); i++) {
            arrayListComNo.add(comlist.get(i).getComNo());
            log.info("comlist : " + comlist.get(i).getComNo());
            arrayListID.add(comlist.get(i).getId());
            arrayListTxt.add(comlist.get(i).getComtxt());
        }
        HashMap<String, Object> has = new HashMap<>();
        has.put("title", list.getTitle());
        has.put("txt", list.getTxt());
        has.put("idarry", arrayListID);
        has.put("txtarry", arrayListTxt);
        has.put("comNo", arrayListComNo);
        return has;
    }


}
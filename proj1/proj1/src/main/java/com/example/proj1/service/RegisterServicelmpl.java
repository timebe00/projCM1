package com.example.proj1.service;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log
@Service
public class RegisterServicelmpl implements RegisterService{
    @Autowired
    private RegisterRepository repository;

    @Override
    public Boolean same(Register register) throws Exception {
        String id = register.getId().trim();
        log.info("id : " + id);
        boolean bol = repository.existsById(id);
        log.info("bol : " + bol);
        return bol;
    }

    @Override
    public void register(Register register) throws Exception {
        repository.save(register);
    }

    @Override
    public String login(Register register) throws Exception {
        boolean TF = repository.findByIdAndPw(register.getId(), register.getPw()).isEmpty();
        if(TF) {
            return null;
        } else {
            return register.getId();
        }
    }

    @Override
    public String findid(Register register) throws Exception {
        List<Register> list = repository.findByNameAndPhoAndPn(register.getName(), register.getPho(), register.getPn());
        log.info("list : " + list);
        boolean TF = list.isEmpty();
        log.info("TF : " + TF);
        if(TF) {
            return null;
        } else {
            log.info("list.indexOf(0) : " + list.get(0).getId());
            return list.get(0).getId();
        }
    }

    @Override
    public Boolean findpw(Register register) throws Exception {
        boolean TF = repository.findByNameAndPhoAndPnAndId(register.getName(), register.getPho(), register.getPn(), register.getId()).isEmpty();
        return TF;
    }

    @Override
    public void reset(Register register) throws Exception {
        Register upLod = repository.findById(register.getId()).get(0);
        upLod.setPw(register.getPw());
        repository.save(upLod);
    }

}

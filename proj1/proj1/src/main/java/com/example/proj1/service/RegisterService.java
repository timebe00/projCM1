package com.example.proj1.service;

import com.example.proj1.entity.Register;

public interface RegisterService {
    public Boolean same(Register register) throws Exception;
    public Boolean register(Register register) throws Exception;
    public String login(Register register) throws Exception;
    public String findid(Register register) throws Exception;
    public Boolean findpw(Register register) throws Exception;
    public void  reset(Register register) throws Exception;
}

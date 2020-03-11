package com.wso.dao;

import com.wso.dm.DmBasKidNa;

public interface DaoLogin {
    DmBasKidNa findLoginUser(Integer accKid) throws  Exception;

    Integer addUser(DmBasKidNa user) throws  Exception;
}

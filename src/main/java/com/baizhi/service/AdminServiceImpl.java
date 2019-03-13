package com.baizhi.service;

import com.baizhi.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminDao ad;
    public Object queryall(){
        Object admins = ad.queryByNameAndpassword();
        return admins;
    }
}

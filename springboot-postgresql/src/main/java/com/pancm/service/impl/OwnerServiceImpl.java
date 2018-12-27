package com.pancm.service.impl;

import com.pancm.dao.OwnerDao;
import com.pancm.domain.Owner;
import com.pancm.service.IOwnerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ownerService")
public class OwnerServiceImpl implements IOwnerService {

    @Resource
    private OwnerDao ownerDao;

    @Override
    public Owner getOwnerById(Integer id) {
        Owner condition = new Owner();
        condition.setId(id);
        return ownerDao.selectOwner(condition);
    }

}

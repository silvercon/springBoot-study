package com.pancm.controller;

import com.pancm.domain.Owner;
import com.pancm.service.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private IOwnerService ownerService;

    @RequestMapping("/getInfoById")
    public Owner getInfoById(HttpServletRequest request){
        int ownerId = Integer.parseInt(request.getParameter("id"));

        Owner owner = ownerService.getOwnerById(ownerId);

        return  owner;
    }

}

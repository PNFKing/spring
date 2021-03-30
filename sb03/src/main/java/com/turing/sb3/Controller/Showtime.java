package com.turing.sb3.Controller;

import com.turing.sb3.Service.EmpService;
import com.turing.sb3.entity.Emp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Showtime {

    @Autowired
    private EmpService empService;

    @RequestMapping("/s")
    public List<Emp> Dateshow(){
        return empService.findAll();
    }

}



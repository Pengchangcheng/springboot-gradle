package com.pcc.demoweb.controller;

import com.pcc.demo.entity.City;
import com.pcc.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: pengchangcheng
 * @Date: 2020/7/8 10:58
 * @description:
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("/findAll")
    public List<City> findAll() {
        return cityService.findAll();
    }

}

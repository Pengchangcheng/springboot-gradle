package com.pcc.demo.service;

import com.pcc.demo.dao.CityDao;
import com.pcc.demo.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: pengchangcheng
 * @Date: 2020/7/8 10:51
 * @description:
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> findAll() {
        return cityDao.findAll();
    }
}

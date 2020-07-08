package com.pcc.demo.dao;

import com.pcc.demo.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: pengchangcheng
 * @Date: 2020/7/8 10:52
 * @description:
 */
@Mapper
public interface CityDao {

    @Select("select * from city limit 10")
    List<City> findAll();

}

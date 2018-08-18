package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.HotelMapper;
import com.dyhc.sdglgroundconnection.mapper.RestaurantMapper;
import com.dyhc.sdglgroundconnection.pojo.Restaurant;
import com.dyhc.sdglgroundconnection.service.RestaurantService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 餐馆业务实现
 **/
@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantMapper restaurantMapper;


    @Override
    public PageInfo<Restaurant> listRestaurants(Integer pageNo, Integer PageSize,String restaurantName, String restaurantAddress,Integer whetherDel) throws Exception {
        PageHelper.startPage(pageNo, PageSize, true);
        PageInfo<Restaurant> pageInfo = new PageInfo<>(restaurantMapper.selectByEx(restaurantName,restaurantAddress,whetherDel));
        return pageInfo;
    }

    @Override
    public int delRestaurantById(int restaurantId) throws Exception {
        return restaurantMapper.delRestaurantById(restaurantId);
    }

    @Override
    public int insertRestaurant(Restaurant restaurant) {
        return restaurantMapper.insert(restaurant);
    }

    @Override
    public Restaurant selectRestaurantById(int restaurantId) {
        return restaurantMapper.selectByPrimaryKey(restaurantId);
    }

    @Override
    public int updateRestaurantById(Restaurant restaurant) {
        return restaurantMapper.updateRestaurantById(restaurant);
    }

}

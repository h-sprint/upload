package com.example.upload.service;

import com.example.upload.entity.Weather;
import com.example.upload.mapper.WeatherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 学无止境~冲
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class WeatherService {

    @Autowired
    private WeatherMapper weatherMapper;

    public boolean addweather(Weather weather) throws Exception {
        return this.weatherMapper.insertweather(weather) > 0;
    }

    public boolean addbatch(List<Weather> weatherList) throws Exception {
        return this.weatherMapper.insertbatch(weatherList) > 0;
    }


}
package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 城市
 * Created by Switch on 2017/5/24.
 */

public class City extends DataSupport {
    private Integer id;
    private String cityName;
    private Integer cityCode;
    private Integer provinceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
}

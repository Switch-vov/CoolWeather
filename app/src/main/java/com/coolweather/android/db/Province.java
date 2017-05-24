package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Switch on 2017/5/24.
 */
public class Province extends DataSupport {
    private Integer id;
    private String provinceName;
    private Integer provinceCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }
}

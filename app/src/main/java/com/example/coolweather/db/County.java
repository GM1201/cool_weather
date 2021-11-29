package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    private int id;
    private String countyname;
    private String weatherId;
    private int countyCode;
    private int cityId;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCountyname() {
        return countyname;
    }
    public void setCountyname(String countyname) {
        this.countyname = countyname;
    }
    public int getCountyCode() {
        return countyCode;
    }
    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }
    public String getWeatherId() {
        return weatherId;
    }
    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
    public int getCityId() {
        return cityId;
    }
    public void seiCityId(int cityId) {
        this.cityId = cityId;
    }
}

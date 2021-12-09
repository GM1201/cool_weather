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

    public String getCountyName() {
        return countyname;
    }
    public void setCountyName(String countyname) {
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
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

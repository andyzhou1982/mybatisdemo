package com.duoblock.mybatisdemo.entity.po;

import java.util.Date;

public class BusFlLocRecord {
    private Integer recordId;

    private Integer flId;

    private String longitude;

    private String latitude;

    private Date locTime;

    private Byte status;

    private String ver;

    private Integer creator;

    private Date createTime;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getFlId() {
        return flId;
    }

    public void setFlId(Integer flId) {
        this.flId = flId;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Date getLocTime() {
        return locTime;
    }

    public void setLocTime(Date locTime) {
        this.locTime = locTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver == null ? null : ver.trim();
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
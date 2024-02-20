package com.example.appdoctruyen;

import org.json.JSONException;
import org.json.JSONObject;

public class ChapTruyen {
    private String tenChap, ngayDang, id;
    public ChapTruyen(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenChap() {
        return tenChap;
    }

    public void setTenChap(String tenChap) {
        this.tenChap = tenChap;
    }

    public String getNgayDang() {
        return ngayDang;
    }

    public void setNgayDang(String ngayDang) {
        this.ngayDang = ngayDang;
    }

    public ChapTruyen(String tenChap, String ngayDang) {
        this.tenChap = tenChap;
        this.ngayDang = ngayDang;
    }
    public ChapTruyen(JSONObject chap) throws JSONException {
        tenChap = chap.getString("tenChap");
        ngayDang = chap.getString("ngayDang");
        id = chap.getString("id");
    }
}

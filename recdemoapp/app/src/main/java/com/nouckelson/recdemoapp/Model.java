package com.nouckelson.recdemoapp;

public class Model {
    private String header;
    private String desc;
    private int imgname;
    public Model() { }
    public Model(String header, String desc, int imgname) {
        this.header = header;
        this.desc = desc;
        this.imgname = imgname;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImgname() {
        return imgname;
    }

    public void setImgname(int imgname) {
        this.imgname = imgname;
    }
}

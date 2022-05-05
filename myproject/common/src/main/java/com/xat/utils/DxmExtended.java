package com.xat.utils;

public class DxmExtended {
    private String id;

    private String sex;

    public DxmExtended(String id, String sex) {
        this.id = id;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

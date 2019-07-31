package com.sb.bean;

import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer id;
    private String uname;
    private String upsd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpsd() {
        return upsd;
    }

    public void setUpsd(String upsd) {
        this.upsd = upsd;
    }
}

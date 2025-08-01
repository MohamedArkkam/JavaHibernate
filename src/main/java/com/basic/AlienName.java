package com.basic;

import javax.persistence.Embeddable;

@Embeddable
public class AlienName {

    private String fname;
    private String lname;

    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "AlienName [fname=" + fname + ", lname=" + lname + "]";
    }
}

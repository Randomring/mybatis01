package com.cs.pojo;

public class School {
    private int id;
    private String schoolname;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSchoolname() {
        return schoolname;
    }
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
    @Override
    public String toString() {
        return "School{" + "id=" + id + ", schoolname='" + schoolname + '\'' + '}';
    }
}

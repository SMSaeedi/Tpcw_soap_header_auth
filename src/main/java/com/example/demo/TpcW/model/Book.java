package com.example.demo.TpcW.model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.Date;

public class Book implements Serializable {

    public Book() {
    }

    public Book(ResultSet rs) {
        try {
            i_id = rs.getInt("i_id");
            i_title = rs.getString("i_title");
            i_pub_Date = rs.getDate("i_pub_Date");
            i_publisher = rs.getString("i_publisher");
            i_subject = rs.getString("i_subject");
            i_desc = rs.getString("i_desc");
            i_related1 = rs.getInt("i_related1");
            i_related2 = rs.getInt("i_related2");
            i_related3 = rs.getInt("i_related3");
            i_related4 = rs.getInt("i_related4");
            i_related5 = rs.getInt("i_related5");
            i_thumbnail = rs.getString("i_thumbnail");
            i_image = rs.getString("i_image");
            i_srp = rs.getDouble("i_srp");
            i_cost = rs.getDouble("i_cost");
            i_avail = rs.getDate("i_avail");
            i_isbn = rs.getString("i_isbn");
            i_page = rs.getInt("i_page");
            i_backing = rs.getString("i_backing");
            i_dimensions = rs.getString("i_dimensions");
            a_id = rs.getInt("a_id");
            a_fname = rs.getString("a_fname");
            a_lname = rs.getString("a_lname");
        } catch (Exception ex) {
            //ex.printStackTrace();
        }
    }

    public int i_id;
    public String i_title;
    public Date i_pub_Date;
    public String i_publisher;
    public String i_subject;
    public String i_desc;
    public int i_related1;
    public int i_related2;
    public int i_related3;
    public int i_related4;
    public int i_related5;
    public String i_thumbnail;
    public String i_image;
    public double i_srp;
    public double i_cost;
    public Date i_avail;
    public String i_isbn;
    public int i_page;
    public String i_backing;
    public String i_dimensions;
    public int a_id;
    public String a_fname;
    public String a_lname;

    public Book(String i_title, String i_subject, String a_fname) {
        this.i_title = i_title;
        this.i_subject = i_subject;
        this.a_fname = a_fname;
    }
}
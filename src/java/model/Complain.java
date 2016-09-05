/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author klgsa
 */
public class Complain {
    
    private int cID;
    private int uID;
    private int lNID;
    private Date date;
    private String content;

    public Complain() {
    }

    public Complain(int cID, int uID, int lNID, Date date, String content) {
        this.cID = cID;
        this.uID = uID;
        this.lNID = lNID;
        this.date = date;
        this.content = content;
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public int getlNID() {
        return lNID;
    }

    public void setlNID(int lNID) {
        this.lNID = lNID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
    
}

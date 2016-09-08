/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Akhila Damsari
 */
public class Sound {
    private int trackID;
    private Date date;
    private String soundLink;

    public Sound() {
    }

    public Sound(int trackID, Date date, String soundLink) {
        this.trackID = trackID;
        this.date = date;
        this.soundLink = soundLink;
    }

    public int getTrackID() {
        return trackID;
    }

    public void setTrackID(int trackID) {
        this.trackID = trackID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSoundLink() {
        return soundLink;
    }

    public void setSoundLink(String soundLink) {
        this.soundLink = soundLink;
    }
    
    
    
}

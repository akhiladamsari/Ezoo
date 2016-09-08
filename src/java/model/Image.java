/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Akhila Damsari
 */
public class Image {
    private int imageID;
    private int location;
    private int temp;
    private int elevation;

    public Image() {
    }

    public Image(int imageID, int location, int temp, int elevation) {
        this.imageID = imageID;
        this.location = location;
        this.temp = temp;
        this.elevation = elevation;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }
    
    
}

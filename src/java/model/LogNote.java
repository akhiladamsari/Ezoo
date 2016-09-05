/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author klgsa
 */
public class LogNote {
    private int lNID;
    private int uID;
    private String image;
    private String soundFile;
    private String province;
    private String nearestCity;
    private double lX;
    private double lY;
    private double temperature;
    private double elevation;
    private String habitat;
    private String special;
    private String name;
    private String looksLike;
    private double sizeHight;
    private double sizeWidth;
    private String shapeLike;
    private String color;
    private String behaviour;
    private String otherNote;

    public LogNote() {
    }

    public LogNote(int lNID, int uID, String image, String soundFile, String province, String nearestCity, double lX, double lY, double temperature, double elevation, String habitat, String special, String name, String looksLike, double sizeHight, double sizeWidth, String shapeLike, String color, String behaviour, String otherNote) {
        this.lNID = lNID;
        this.uID = uID;
        this.image = image;
        this.soundFile = soundFile;
        this.province = province;
        this.nearestCity = nearestCity;
        this.lX = lX;
        this.lY = lY;
        this.temperature = temperature;
        this.elevation = elevation;
        this.habitat = habitat;
        this.special = special;
        this.name = name;
        this.looksLike = looksLike;
        this.sizeHight = sizeHight;
        this.sizeWidth = sizeWidth;
        this.shapeLike = shapeLike;
        this.color = color;
        this.behaviour = behaviour;
        this.otherNote = otherNote;
    }

    public int getlNID() {
        return lNID;
    }

    public void setlNID(int lNID) {
        this.lNID = lNID;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getNearestCity() {
        return nearestCity;
    }

    public void setNearestCity(String nearestCity) {
        this.nearestCity = nearestCity;
    }

    public double getlX() {
        return lX;
    }

    public void setlX(double lX) {
        this.lX = lX;
    }

    public double getlY() {
        return lY;
    }

    public void setlY(double lY) {
        this.lY = lY;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLooksLike() {
        return looksLike;
    }

    public void setLooksLike(String looksLike) {
        this.looksLike = looksLike;
    }

    public double getSizeHight() {
        return sizeHight;
    }

    public void setSizeHight(double sizeHight) {
        this.sizeHight = sizeHight;
    }

    public double getSizeWidth() {
        return sizeWidth;
    }

    public void setSizeWidth(double sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    public String getShapeLike() {
        return shapeLike;
    }

    public void setShapeLike(String shapeLike) {
        this.shapeLike = shapeLike;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getOtherNote() {
        return otherNote;
    }

    public void setOtherNote(String otherNote) {
        this.otherNote = otherNote;
    }
    
    
    
}

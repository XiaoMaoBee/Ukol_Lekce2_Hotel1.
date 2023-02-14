package com.engeto.hotel;

import java.math.BigDecimal;

public class Room {

    private int roomNumber;
    private int numOfBeds;
    private boolean hasBalcony;
    private boolean hasSeaView;
    private BigDecimal pricePerNight;

    public Room(int roomNumber,int numOfBeds,BigDecimal pricePerNight
            ,boolean hasBalcony,boolean hasSeaView) {
        this.roomNumber = roomNumber;
        this.numOfBeds = numOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.pricePerNight = pricePerNight;
    }

    ///region getters/setters
    public int getRoomNumber() {
        return this.roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public int getNumOfBeds() {
        return this.numOfBeds;
    }
    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }
    public boolean hasBalcony() {
        return this.hasBalcony;
    }
    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }
    public boolean hasSeaView() {
        return this.hasSeaView;
    }
    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }
    public BigDecimal getPricePerNight() {
        return this.pricePerNight;
    }
    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
    ///endregion
}

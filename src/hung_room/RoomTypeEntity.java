/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung_room;

/**
 *
 * @author Admin
 */
public class RoomTypeEntity {
    private int roomTypeID;
    private String roomTypeName;
    private double roomRate;
    private String note;

    public RoomTypeEntity(int roomTypeID, String roomTypeName, double roomRate, String note) {
        this.roomTypeID = roomTypeID;
        this.roomTypeName = roomTypeName;
        this.roomRate = roomRate;
        this.note = note;
    }

    public int getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(int roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public double getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(double roomRate) {
        this.roomRate = roomRate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
}

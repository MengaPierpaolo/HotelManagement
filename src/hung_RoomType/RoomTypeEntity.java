/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung_RoomType;

/**
 *
 * @author Admin
 */
public class RoomTypeEntity {
    private int roomTypeID;
    private String roomTypeName;
    private double roomTypeRate;
    private String roomTypeNote;

    public RoomTypeEntity(int roomTypeID, String roomTypeName, double roomTypeRate, String roomTypeNote) {
        this.roomTypeID = roomTypeID;
        this.roomTypeName = roomTypeName;
        this.roomTypeRate = roomTypeRate;
        this.roomTypeNote = roomTypeNote;
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

    public double getRoomTypeRate() {
        return roomTypeRate;
    }

    public void setRoomRate(double roomRate) {
        this.roomTypeRate = roomRate;
    }

    public String getRoomTypeNote() {
        return roomTypeNote;
    }
}

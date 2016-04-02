/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung_Room;

/**
 *
 * @author Admin
 */
public class RoomEntity {
    private int roomID;
    private String roomName;
    private int roomTypeID;
    private String roomStatus;

    public RoomEntity(int roomID, String roomName, int roomTypeID, String roomStatus) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomTypeID = roomTypeID;
        this.roomStatus = roomStatus;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(int roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }
    
    
}

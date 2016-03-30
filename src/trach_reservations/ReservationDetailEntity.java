/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trach_reservations;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class ReservationDetailEntity {
    private int RoomID;
    private int ReservationID;
    private Date date;
    private double rate;

    public ReservationDetailEntity(int RoomID, int ReservationID, Date date, double rate) {
        this.RoomID = RoomID;
        this.ReservationID = ReservationID;
        this.date = date;
        this.rate = rate;
    }

    public int getRoomID() {
        return RoomID;
    }

    public int getReservationID() {
        return ReservationID;
    }

    public Date getDate() {
        return date;
    }

    public double getRate() {
        return rate;
    }

    public void setRoomID(int RoomID) {
        this.RoomID = RoomID;
    }

    public void setReservationID(int ReservationID) {
        this.ReservationID = ReservationID;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
}

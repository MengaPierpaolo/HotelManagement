/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trach_reservations;

import java.sql.Date;

/**
 *
 * @author Administrator
 */
public class ReservationEntity {
    private int ResID;
    private String status;
    private Date checkInDate;
    private Date checkOutDate;
    private int roomID;
    private int cusID;
    private double paid;
    private int numberofpeople;


    public ReservationEntity(int ResID, String status,int numberofpeople, Date checkInDate, Date checkOutDate, int roomID, int cusID,  double paid) {
        this.ResID = ResID;
        this.status = status;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomID = roomID;
        this.cusID = cusID;
        this.paid = paid;
        this.numberofpeople = numberofpeople;
    }
    public ReservationEntity(String status,int numberofpeople, Date checkInDate, Date checkOutDate, int roomID, int cusID,  double paid) {
        this.status = status;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomID = roomID;
        this.cusID = cusID;
        this.paid = paid;
        this.numberofpeople = numberofpeople;
    }
   

    public int getResID() {
        return ResID;
    }

    public int getNumberofpeople() {
        return numberofpeople;
    }

    public void setNumberofpeople(int numberofpeople) {
        this.numberofpeople = numberofpeople;
    }

    public String getStatus() {
        return status;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public int getRoomID() {
        return roomID;
    }

    public int getCusID() {
        return cusID;
    }


    public double getPaid() {
        return paid;
    }


    public void setResID(int ResID) {
        this.ResID = ResID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void setCusID(int cusIS) {
        this.cusID = cusIS;
    }



    public void setPaid(double paid) {
        this.paid = paid;
    }

    
}

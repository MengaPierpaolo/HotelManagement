/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trach_reservations;

import hung_room.RoomEntity;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import projectinterface.DAOConnection;
import vu_guest.CustomerEnity;


/**
 *
 * @author Administrator
 */
public class ReservationDAO implements DAOConnection{
    ReservationEntity res;
    DbConnect db;
    Connection con;
    Statement st;
    ResultSet rs;
    String sql;
    int ResID; String status; Date checkInDate; 
    Date checkOutDate; int roomID; int cusID, num; 
    int paid; 
    Vector<ReservationEntity> resCollection;
    
    public ReservationDAO() {
        db = new DbConnect("sa", "root");
        db.createConnect();
        st = db.getStsm();
        con = db.getCon();
        resCollection = new Vector<>();
    }
    public int countRow(){
        int row = 0;
        try {
              sql="select count(*) from Reservation";
       
            rs = st.executeQuery(sql);
            rs.next();
            row = rs.getInt(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return row;
    }
    public Vector<ReservationEntity> pageData(int page){
        try {
            sql = "select top 10 * from Reservation where ReservationID not in (select top "+(page*10-10)+" ReservationID from Reservation)";
            rs = st.executeQuery(sql);
            while(rs.next()){
                ResID = rs.getInt(1);
                cusID = rs.getInt(2);
                checkInDate = rs.getDate(3);
                checkOutDate = rs.getDate(4);
                num = rs.getInt(5);
                paid = rs.getInt(6);
                status = rs.getString(7);
                roomID = rs.getInt(8);
                res = new ReservationEntity(ResID, status,num, checkInDate, checkOutDate, 
                        roomID, cusID,  paid);
                resCollection.add(res);
            }
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
        return resCollection;
    }
    @Override
    public Vector<ReservationEntity> getCollection(){
        try {
            sql = "select * from Reservation";
            rs = st.executeQuery(sql);
            while(rs.next()){
                ResID = rs.getInt(1);
                cusID = rs.getInt(2);
                checkInDate = rs.getDate(3);
                checkOutDate = rs.getDate(4);
                num = rs.getInt(5);
                paid = rs.getInt(6);
                status = rs.getString(7);
                roomID = rs.getInt(8);
                res = new ReservationEntity(ResID, status,num, checkInDate, checkOutDate, 
                        roomID, cusID,  paid);
                resCollection.add(res);
            }
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
        return resCollection;
    }
    @Override
    public void insert(Object obj) {
        
        try {
            ReservationEntity objRes = (ReservationEntity) obj;
            sql = "insert into Reservation(CustomerID,StartDate,EndDate,NumberOfPeople,Paid,Status,RoomID) "
                    + "values("+ objRes.getCusID() +",'" +objRes.getCheckInDate()+"','"+objRes.getCheckOutDate()+"',"+ objRes.getNumberofpeople()
                    +","+objRes.getPaid()+",'"+objRes.getStatus()+"',"+objRes.getRoomID()+ ")";
            st.execute(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     *
     * @param obj
     */
    @Override
    public void update(Object obj) {
        try {
             ReservationEntity objRes = (ReservationEntity) obj;
              sql="Update Reservation set CustomerID="+objRes.getCusID()+" ,startdate='"+objRes.getCheckInDate()+"' ,enddate= '"+objRes.getCheckOutDate()+"' ,NumberOfPeople="+objRes.getNumberofpeople()+
                      " ,paid="+objRes.getPaid()+",status='"+objRes.getStatus()+"',roomid="+objRes.getRoomID()+" where ReservationID="+objRes.getResID();
       
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector<Object> search(String sString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public RoomEntity search(int roomID){
        RoomEntity room = null;
        try {
            
            sql = "select * from Rooms where roomid="+ roomID;
            rs = st.executeQuery(sql);
            rs.next();
            room = new RoomEntity(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return room;
    }
    public CustomerEnity searchCus(int cusID){
        CustomerEnity cus = null;
        try {
            
            sql = "select * from Customer where CustomerID ="+ cusID;
            rs = st.executeQuery(sql);
            rs.next();
            cus = new CustomerEnity(rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(9), rs.getString(10), rs.getString(8), rs.getDate(3),rs.getInt(1));
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cus;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung_Room;

import connection.DbConnect;
import hung_RoomType.RoomTypeEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import projectinterface.CentralInterface;
import projectinterface.DAOConnection;

/**
 *
 * @author Admin
 */
public class RoomDAO implements DAOConnection{
    
    private int roomID;
    private String roomName;
    private int roomTypeID;
    private String roomStatus;
    
    private String roomTypeName;
    private double roomTypeRate;
    private String roomTypeNote;
    
    DbConnect db;
    Connection con;
    Statement st;
    ResultSet rs;
    String sql;
    RoomEntity roomEntity;
    Vector<RoomEntity> roomEntityCollection;
    
    RoomTypeEntity roomTypeEntity;
    Vector<RoomTypeEntity> roomTypeEntityCollection;

    public RoomDAO() {
        db = new DbConnect("sa", "vanhung91");
        db.createConnect();
        st = db.getStsm();
        roomEntityCollection = new Vector<>();
        roomTypeEntityCollection = new Vector<>();
    }
    public Vector getRoomTypeCollection() {
        try {
            sql = "select * from roomtype";
            rs = st.executeQuery(sql);
            rs.beforeFirst();
            while(rs.next()) {
                this.roomTypeID = rs.getInt(1);
                this.roomTypeName = rs.getString(2);
                this.roomTypeRate = rs.getDouble(3);
                this.roomTypeNote = rs.getString(4);
                
                roomTypeEntity = new RoomTypeEntity(roomTypeID, roomTypeName, roomTypeRate, roomTypeNote);
                roomTypeEntityCollection.add(roomTypeEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roomTypeEntityCollection;
    }
    public RoomEntity searchRoom(String rName) {
        try {
            sql = "select * from Rooms where roomname= ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, rName);
            rs = pstmt.executeQuery();
            rs.next();
            this.roomID = rs.getInt(1);
            this.roomName = rs.getString(2);
            this.roomTypeID = rs.getInt(3);
            this.roomStatus = rs.getString(4);

            roomEntity = new RoomEntity(roomID, roomName, roomTypeID, roomStatus);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return roomEntity;
    }
    
    @Override
    public Vector getCollection() {
        try {
            sql = "select * from Rooms";
            rs = st.executeQuery(sql);
            while(rs.next()) {
                this.roomID = rs.getInt(1);
                this.roomName = rs.getString(2);
                this.roomTypeID = rs.getInt(3);
                this.roomStatus = rs.getString(4);
                
                roomEntity = new RoomEntity(roomID, roomName, roomTypeID, roomStatus);
                roomEntityCollection.add(roomEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roomEntityCollection;
    }
    private void getDataFromObject(Object obj) {
        roomEntity = (RoomEntity) obj;
        this.roomID = roomEntity.getRoomID();
        this.roomName = roomEntity.getRoomName();
        this.roomTypeID = roomEntity.getRoomTypeID();
        this.roomStatus = roomEntity.getRoomStatus();
    }
    @Override
    public void insert(Object obj) {
        getDataFromObject(obj);
        try {
            sql = "select * from Rooms";
            rs = st.executeQuery(sql);
            rs.moveToInsertRow();
            rs.updateString(2, this.roomName);
            rs.updateInt(3, this.roomTypeID);
            rs.updateString(4, this.roomStatus);
            rs.insertRow();
//            sql = "Insert into Rooms values('"+this.roomName+"', "+this.roomTypeID+", '"+this.roomStatus+"')";
//            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Object obj) {
        getDataFromObject(obj);
        try {
//            sql = "update Rooms set RoomName = '"+this.roomName+
//                    "', RoomTypeID = "+this.roomTypeID+", roomstatus = '"+this.roomStatus+
//                    "' where RoomID = "+this.roomID;
//            st.executeUpdate(sql);
            sql = "select * from Rooms";
            rs = st.executeQuery(sql);
            rs.beforeFirst();
            while(rs.next()) {
                if(rs.getInt(1) == this.roomID) {
                    rs.updateString(2, this.roomName);
                    rs.updateInt(3, this.roomTypeID);
                    rs.updateString(4, this.roomStatus);
                    rs.updateRow();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
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
    
}

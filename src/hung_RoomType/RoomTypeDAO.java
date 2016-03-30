/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung_RoomType;

import connection.DbConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class RoomTypeDAO {
    
    DbConnect db;
    Connection con;
    Statement st;
    ResultSet rs;
    String sql;
    
    private int    roomTypeID;
    private String roomTypeName;
    private double roomTypeRate;
    private String roomTypeNote;
    
    RoomTypeEntity roomTypeEntity;
    Vector<RoomTypeEntity> roomTypeEntityCollection;
    
    public RoomTypeDAO() {
        db = new DbConnect("sa", "vanhung91");
        db.createConnect();
        st = db.getStsm();
        con = db.getCon();
        roomTypeEntityCollection = new Vector<>();
    }
    
    public Vector getCollection() {
        try {
            sql = "select * from roomtype";
            rs = st.executeQuery(sql);
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
    
    private void getTextFromEntity(RoomTypeEntity roomTypeEntity) {
        this.roomTypeID   = roomTypeEntity.getRoomTypeID();
        this.roomTypeName = roomTypeEntity.getRoomTypeName();
        this.roomTypeRate = roomTypeEntity.getRoomTypeRate();
        this.roomTypeNote = roomTypeEntity.getRoomTypeNote();
    }
    
    public void insert(RoomTypeEntity roomTypeEntity) {
        getTextFromEntity(roomTypeEntity);
        try {
//            sql = "select * from roomtype";
//            rs = st.executeQuery(sql);
//            rs.moveToInsertRow();
//            rs.updateString(2, this.roomTypeName);
//            rs.updateDouble(3, this.roomTypeRate);
//            rs.updateString(4, this.roomTypeNote);
//            rs.insertRow();
//            System.out.println("Done");
            sql = "insert into roomtype values ('"+this.roomTypeName+"', "+this.roomTypeRate+", '"+this.roomTypeNote+"')";
            st.executeQuery(sql);
        } catch (Exception e) {
        }
    }

    public void update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Vector<Object> search(String sString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

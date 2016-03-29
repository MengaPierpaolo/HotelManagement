/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung_room;

import connection.DbConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import projectinterface.DAOConnection;

/**
 *
 * @author Admin
 */
public class RoomTypeDAO implements DAOConnection{
    
    private int roomTypeID;
    private String roomTypeName;
    private double roomRate;
    private String roomTypeNote;
    
    RoomTypeEntity roomTypeEntity;
    DbConnect db;
    Connection con;
    Statement st;
    ResultSet rs;
    String sql;
    Vector<RoomTypeEntity> roomTypeCollection;
    
    public RoomTypeDAO() {
        db = new DbConnect("sa", "vanhung91");
        db.createConnect();
        st = db.getStsm();
        roomTypeCollection = new Vector<>();
    }
    @Override
    public Vector getCollection() {
        try {
            sql = "select * from roomtype";
            rs = st.executeQuery(sql);
            while(rs.next()) {
                this.roomTypeID = rs.getInt(1);
                this.roomTypeName = rs.getString(2);
                this.roomRate = rs.getDouble(3);
                this.roomTypeNote = rs.getString(4);
                
                roomTypeEntity = new RoomTypeEntity(roomTypeID, roomTypeName, roomRate, roomTypeNote);
                roomTypeCollection.add(roomTypeEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roomTypeCollection;
    }

    @Override
    public void insert(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object obj) {
        roomTypeEntity = (RoomTypeEntity) obj;
        
        roomTypeID = roomTypeEntity.getRoomTypeID();
        roomTypeName = roomTypeEntity.getRoomTypeName();
        roomRate = roomTypeEntity.getRoomRate();
        roomTypeNote = roomTypeEntity.getNote();
        
        try {
            sql = "select * roomType";
            rs = st.executeQuery(sql);
            rs.beforeFirst();
            while(rs.next()) {
                if(roomTypeID == rs.getInt(1)) {
                    rs.updateString(2, roomTypeName);
                    rs.updateDouble(3, roomRate);
                    rs.updateString(4, roomTypeNote);
                }
                System.out.println("Done Update");
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

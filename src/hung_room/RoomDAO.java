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
    
    RoomEntity roomEntity;
    DbConnect db;
    Connection con;
    Statement st;
    ResultSet rs;
    String sql;
    Vector<RoomEntity> roomEntityCollection;

    public RoomDAO() {
        db = new DbConnect("sa", "vanhung91");
        db.createConnect();
        st = db.getStsm();
        roomEntityCollection = new Vector<>();
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

    @Override
    public void insert(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

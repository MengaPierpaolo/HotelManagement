/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectinterface;

import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Administrator
 */
public interface DAOConnection {
    public Vector rescus();
    public Vector getCollection();
    public void insert(Object obj);
    public void update(Object obj);
    public void delete();
    public Vector<Object> search(String sString);
    
}

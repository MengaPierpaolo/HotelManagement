/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vu_guest;

import connection.DbConnect;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import projectinterface.DAOConnection;

/**
 *
 * @author KeVin
 */
public class CustomerDao implements DAOConnection{
    CustomerEnity cus;
    DbConnect db;
    Connection con;
    Statement st;
    ResultSet rs;
    String sql;
    String identifier,fullname,gender,company,address,phone,email,status;
    Date age;
    int cusID,resid;
    
    Vector<CustomerEnity> cuscollection;
    
    public CustomerDao(){
        db=new DbConnect("sa", "");
        db.createConnect();
        st=db.getStsm();
        con=db.getCon();
        cuscollection =new Vector<>();
        
    }
    @Override
    public Vector<CustomerEnity> getCollection(){
        try {
            sql="select * from Customer";
            rs=st.executeQuery(sql);
            while(rs.next()){
                cusID=rs.getInt(1);
                identifier=rs.getString(2);
                age=rs.getDate(3);
                fullname=rs.getString(4);
                gender=rs.getString(5);
                company=rs.getString(6);
                address=rs.getString(7);
                status=rs.getString(8);
                phone=rs.getString(9);
                email=rs.getString(10);
                
                cus=new CustomerEnity(identifier, fullname, gender, company, address, phone, email, status, (java.sql.Date) age, cusID);
                cuscollection.add(cus);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cuscollection;
    }



    @Override
    public void insert(Object obj) {
        
        try {
            CustomerEnity objCus = (CustomerEnity) obj;
            sql = "insert into Customer([Person Identifier],fullname,gender,company,address,phone,email,status,DOB) "
                    + "values('"+ objCus.getIdentifier() +"','" +objCus.getFullname()+"','"+objCus.getGender()+"','"+ objCus.getCompany()
                    +"','"+objCus.getAddress()+"','"+objCus.getPhone()+"','"+objCus.getEmail()+"','"+objCus.getStatus() +"','"+objCus.getAge()+ "')";
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
            CustomerEnity objCus = (CustomerEnity) obj;
              sql="Update Customer set [Person Identifier]='"+objCus.getIdentifier()+"' ,fullname='"+objCus.getFullname()+"' ,gender= '"+objCus.getGender()+"' ,company='"+objCus.getCompany()+"' ,email='"+objCus.getEmail()+"',DOB='"+objCus.getAge()+"',status='"+objCus.getStatus()+"',address='"+objCus.getAddress()
                      +"',phone ='"+objCus.getPhone()+"' where CustomerID="+objCus.getCusID();
       
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    public static void main(String[] args) {
//        CustomerDao cusDAO = new CustomerDao();
//        Vector<CustomerEnity> collection = cusDAO.getCollection();
//        for (CustomerEnity customer : collection) {
//            System.out.println(customer.toString());
//        }
//        CustomerEnity objCus = new CustomerEnity("00000000", "Lai Van Trach", "M", "Neilsen", "Ha huy giap -Q12-HCM", "01283477050", "laivantrachg@mail", "New", new Date(152000));
//        cusDAO.insert((Object) objCus);
//        collection = cusDAO.getCollection();
//        for (CustomerEnity customer : collection) {
//            System.out.println(customer.toString());
//        }
//    }

    @Override
    public Vector<Object> search(String sString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector<CustomerEnity> rescus() {
        try {
            sql="select * from Customer c,Reservation r where r.CustomerID=c.CustomerID";
            rs=st.executeQuery(sql);
            while(rs.next()){
                cusID=rs.getInt(1);
                fullname=rs.getString(4);
                resid=rs.getInt(11);
                cus=new CustomerEnity(identifier, fullname, gender, company, address, phone, email, status, (java.sql.Date) age, cusID, resid);
                cuscollection.add(cus);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cuscollection;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vu_guest;

import java.sql.Date;

/**
 *
 * @author KeVin
 */
public class CustomerEnity {
    private String identifier,fullname,gender,company,address,phone,email,status,roomname;
    private Date age;
    private int cusID;
    private int resid;
    

    public CustomerEnity(String fullname, int cusID, int resid, String roomname) {
        this.fullname = fullname;
        this.cusID = cusID;
        this.resid = resid;
        this.roomname = roomname;
    }

   

    public int getResid() {
        return resid;
    }

    public void setResid(int resid) {
        this.resid = resid;
    }

    public CustomerEnity(String identifier, String fullname, String gender, String company, String address, String phone, String email, String status, Date age, int cusID) {
        this.identifier = identifier;
        this.fullname = fullname;
        this.gender = gender;
        this.company = company;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.age = age;
        this.cusID = cusID;
    }
    public CustomerEnity(String identifier, String fullname, String gender, String company, String address, String phone, String email, String status, Date age) {
        this.identifier = identifier;
        this.fullname = fullname;
        this.gender = gender;
        this.company = company;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.age = age;
    }

    CustomerEnity(String identifier, String fullname, String gen, String company, String address, String phone, String email, String status, String dob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        return identifier+" "+fullname+" "+gender+" "+company+" "+address+" "+phone+" "+email+" " +status +" "+ age;
    }

    
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }
    
}

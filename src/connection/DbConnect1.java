package connection;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AnhDN
 */
import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect1 {

    public Connection con = null;
    public Statement stmt = null;
    public ResultSet rs = null;
    public String url, serverName, user, pass, dbName;

    public DbConnect1() {

    }

    public DbConnect1(String serName, String user, String pass, String dbName) {
        this.serverName = serName;
        this.user = user;
        this.pass = pass;
        this.dbName = dbName;
    }

    public Connection getCon() {
        url = "jdbc:sqlserver://" + serverName + ":1433;databaseName = " + dbName;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public Statement getSta() {
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stmt;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

}

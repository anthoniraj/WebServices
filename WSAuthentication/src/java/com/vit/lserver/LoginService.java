/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vit.lserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Anthoniraj
 */
@WebService(serviceName = "LoginService")
public class LoginService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "compare")
    public String compare(@WebParam(name = "name") String name, @WebParam(name = "pwd") String pwd) {
        String msg = "Default";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select * from users where name='"+name+"' and pwd='"+pwd+"'";
        String host = "jdbc:derby://localhost:1527/student_details";
        try {
            con = DriverManager.getConnection(host, "webservice", "authentication");
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                msg = "Welcome";
            }
            else
            {
                msg = "InValid Ueer";
            }   
            con.close();
        } catch (SQLException ex) {
            msg = ex.getMessage();
        }
        
        return msg;
    }
}

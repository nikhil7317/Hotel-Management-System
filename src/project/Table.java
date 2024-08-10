/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 91731
 */
public class Table {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con= ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("create table users(name varchar(200), email varchar(200), password varchar(50), securityQuestion varchar(500), answer varchar(200), address varchar(200), status varchar(20)) ");
            st.executeUpdate("create table room(roomNo varchar(200), roomType varchar(200), bed varchar(200), price int, status varchar(20))");
            st.executeUpdate("create table customer(id int, name varchar(200), mobileNumber varchar(10), nationality varchar(200), gender varchar(50), email varchar(200), idProof varchar(200), address varchar(500), checkIn varchar(50), roomNo varchar(10), bed varchar(200), roomType varchar(200), pricePerDay int, numberOfDayStay int, totalAmount varchar(200), checkout varchar(50))");
            JOptionPane.showMessageDialog(null, "Table created successfully..");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {

            }
        }
    }
}

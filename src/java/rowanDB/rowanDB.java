/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rowanDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static jdk.nashorn.internal.objects.NativeFunction.call;

/**
 *
 * @author Arun
 */
public class rowanDB {
    
    String Driver="com.mysql.jdbc.Driver";
    String DB_URL ="jdbc:mysql://localhost:3306/rowan?zeroDateTimeBehavior=convertToNull";
    String User="root";
    String Password="Ar_un@200491";
    String s="";
    int i;

    public static String insert(String Firstname,String Lastname,String Gender,String Address,String Zipcode,String Phonenumber,String Email,String Password) throws ClassNotFoundException,SQLException{
         {
        
      String sqlResult="";
      String firstName=Firstname;
      String lastName=Lastname;
      String gender=Gender;
      String address=Address;
      String zipCode=Zipcode;
      String phoneNumber=Phonenumber;
      String email=Email;
      String password=Password;
      int i=0;
         String id="";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rowan?zeroDateTimeBehavior=convertToNull","root","Ar_un@200491");
             
             String SQL="select rowan.sequence()";
            PreparedStatement ps2=con.prepareStatement(SQL);
            ResultSet rs=ps2.executeQuery();
            while(rs.next())
            {
                 id=rs.getString(1);
                 System.out.println("ID"+id);
            }
        String Query="insert into participants values(?,?,?,?,?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(Query);
         System.out.println("ID"+id);
        ps.setString(1,id);
      ps.setString(2,address);
      ps.setString(3,zipCode);
      ps.setString(4,firstName);
      ps.setString(5,lastName);
      ps.setString(6,"M");
      ps.setString(7,phoneNumber);
      ps.setString(8,email);
    
      int count=ps.executeUpdate();
      
      String Query1="insert into credentials values(?,?,?)";
       
      PreparedStatement ps1=con.prepareStatement(Query1);
     
      ps1.setString(1,email);
      ps1.setString(2,password);
      ps1.setString(3,"User");
      int count1=ps1.executeUpdate();
      return id;
      
    }
       
    }
    public static String validate(String Email,String Password) throws ClassNotFoundException,SQLException
       {
           String email=Email;
           String password=Password;
           String pass="";
           int i=0;
           String id="";
           Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rowan?zeroDateTimeBehavior=convertToNull","root","Ar_un@200491");
        
        String Query="select * from credentials where username=?";
        
        PreparedStatement ps=con.prepareStatement(Query);
        ps.setString(1,email);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            pass=rs.getString("password");
        }
        
        if(pass.equals(password))
        {
            String Query1="select participant_id from participants where email_id=?";
        PreparedStatement ps1=con.prepareStatement(Query1);
        ps1.setString(1,email);
        ResultSet rs1=ps1.executeQuery();
        while(rs1.next())
        {
            id=rs1.getString(1);
        }
            i=1;
        }
        else
        {
            i=0;
        }
        return id;
       }
    
    public static String retrieveName(String Email) throws ClassNotFoundException,SQLException
    {
        String email=Email;
        String name="";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rowan?zeroDateTimeBehavior=convertToNull","root","Ar_un@200491");
        
        String Query="select first_name from participants where email_id=?";
        
        PreparedStatement ps=con.prepareStatement(Query);
        ps.setString(1,email);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            name=rs.getString("first_name");
        }
        return name;
    }
    public static int sponsor(String Firstname,String Lastname,String Type,String Amount,String Participant_ID) throws ClassNotFoundException,SQLException{
         {
        
      String sqlResult="";
      String firstName=Firstname;
      String lastName=Lastname;
      String type=Type;
      Float amount=Float.parseFloat(Amount);
      String participant_id=Participant_ID;
      
      int i=0;
         String id="";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rowan?zeroDateTimeBehavior=convertToNull","root","Ar_un@200491");
             
             String SQL="select rowan.sponsor()";
            PreparedStatement ps2=con.prepareStatement(SQL);
            ResultSet rs=ps2.executeQuery();
            while(rs.next())
            {
                 id=rs.getString(1);
                 System.out.println("ID"+id);
            }
        String Query="insert into sponsor values(?,?,?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(Query);
         System.out.println("ID"+id);
        ps.setString(1,id);
      ps.setString(2,participant_id);
      ps.setString(3,firstName);
      ps.setString(4,lastName);
      ps.setString(5,type);
      ps.setFloat(6,amount);
      
    
      int count=ps.executeUpdate();
      return count;
      
         }
    
    }
    }
       


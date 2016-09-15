/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rowanForms;
import rowanDB.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 *
 * @author Arun
 */
@WebServlet(name = "rowanController", urlPatterns = {"/rowanController"})
public class rowanController extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        String url = "/login.html";
        String message="";
        
        String cname;
       int port;
       
        Cookie[] c1= request.getCookies();
       
        Cookie host=new Cookie("host",request.getRemoteAddr());
        
        HttpSession session=request.getSession();
       
        
        

         try{
   
        // get current action
        String action = request.getParameter("action");
        String password="";
        String salt="";
             if(action.equals("signup"))
             {
                 // get parameters from the request
                 String firstName = request.getParameter("firstName");
                 String lastName = request.getParameter("lastName");
                 String Gender = request.getParameter("gender");
                 String address = request.getParameter("address");
                 String zipcode = request.getParameter("zipcode");
                 String phoneNumber=request.getParameter("phoneNumber");
                 String email = request.getParameter("email");
                 password = request.getParameter("password");
                 String confirmPassword=request.getParameter("confirmPassword");
                 
                 
                 
                 // store data in User object and save User object in database
                 if(password.equals(confirmPassword))
                 {
                 String id=rowanDB.insert(firstName, lastName, Gender, address, zipcode, phoneNumber, email, password);
                    
                
                 
                 if(id.equals(null))
                 {
                     message="Username/Password not valid";
                     request.setAttribute("message",message);
                     url="/signup.html";
                     // set User object in request object and set URL
                      // the "thanks" page
                 }
                 else
                 {
                     
                     session.setAttribute("name",firstName);
                     session.setAttribute("id",id);

                     message="";
                     url = "/login.jsp";  
                 }
             }
                 
             }
             
             if(action.equals("login"))
             {
                 // get parameters from the request
                 
                 String email = request.getParameter("email");
                 password = request.getParameter("password");
                 
                 
                 
                 
                 // store data in User object and save User object in database
                 
                 
                 String id=rowanDB.validate(email, password);
                    String name=rowanDB.retrieveName(email);
                
                 
                 if(id.equals(null))
                 {
                     // set User object in request object and set URL
                     message="Username/Password not valid";
                     request.setAttribute("message",message);
                     url="/login.jsp";

                        // the "thanks" page
                 }
                 else
                 {
                     session.setAttribute("name",name);
                     session.setAttribute("id",id);
                     
                     message="";
                     url = "/index.jsp";
                     
                     
                 }
             
                 
             }
               if(action.equals("sponsor"))
             {
                 // get parameters from the request
                 
                 String firstName = request.getParameter("firstName");
                 String lastName = request.getParameter("lastName");
                 String type=request.getParameter("type");
                String amount=request.getParameter("amount");
                 String id=(String)session.getAttribute("id");
                 System.out.println("id from session"+id);
                 
                 
                 
                 
                 // store data in User object and save User object in database
                 
                 
                 int count=rowanDB.sponsor(firstName, lastName, type, amount, id);
                   
                
                 
                 if(count==0)
                 {
                     // set User object in request object and set URL
                     message="Username/Password not valid";
                     request.setAttribute("message",message);
                     url="/login.jsp";

                        // the "thanks" page
                 }
                 else
                 {
                     
                     
                     message="";
                     url = "/index.jsp";
                     
                     
                 }
             
                 
             }
        
              
                
               
                 
                
                 
                 response.addCookie(host);
                 
                 // forward request and response objects to specified URL
                 getServletContext()
                         .getRequestDispatcher(url)
                         .forward(request, response);
             } 
    catch(ClassNotFoundException e)
    {
    String sqlresult="Class Not found exception"+e;
    request.setAttribute("message",e);
    url="/login.jsp";
     getServletContext()
                         .getRequestDispatcher(url)
                         .forward(request, response);
    }
         catch(SQLException e)
    {
    String sqlresult="SQL Exception"+e;
            request.setAttribute("message",sqlresult);
            url="/login.jsp";
             getServletContext()
                         .getRequestDispatcher(url)
                         .forward(request, response);
    }
    }
             
            
    
    @Override
    protected void doGet(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
   
    }
}
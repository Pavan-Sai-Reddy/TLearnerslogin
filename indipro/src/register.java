
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignupServlet")
public class register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
		String Name = request.getParameter("name");
		String PhoneNo = request.getParameter("phno");
		String EmailId = request.getParameter("email");
		String Age = request.getParameter("age");
		String Gender = request.getParameter("gender");
		String Password = request.getParameter("password");
		RequestDispatcher rd = null;
		Connection con = null;
		System.out.println("hello "+Name );
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/indiprog","root","Reddy@1234");
			PreparedStatement pst = con.prepareStatement("INSERT INTO `indiprog`.`custdata` (`Name`, `PhoneNo`, `EmailId`, `Age`, `Gender`, `Password`) VALUES (?,?,?,?,?,?)");
			pst.setString(1, Name);		
			pst.setString(2, PhoneNo);
			pst.setString(3, EmailId);
			pst.setString(4, Age);
			pst.setString(5, Gender);
			pst.setString(6, Password);
			int rowcount=pst.executeUpdate();
			pst.executeUpdate();
			rd =  request.getRequestDispatcher("login.jsp");
			rd.forward(request,response);
			
			if(rowcount>0)
			{
				request.setAttribute("status", "success");
				rd =  request.getRequestDispatcher("login.jsp");
			}
			else 
			{
				request.setAttribute("status", "failed");
			}
			rd.forward(request,response);
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
			
		
	}

}



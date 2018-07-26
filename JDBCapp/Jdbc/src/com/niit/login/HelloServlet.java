package com.niit.login;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.annotation.WebServlet;
@WebServlet("/submit")
public class HelloServlet extends HttpServlet
{
	@overide
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("Username");
		String gender = req.getParameter("Gender");
		String age = req.getParameter("Age");
		String mobile = req.getParameter("Mobile");
		String email = req.getParameter("E-mail");
		Connection conn = ConnectionUtil.getConnection();
		try 
        {
			Statement state =conn.createStatement();
			state.executeUpdate("insert into demo1 values('"+name+"','"+gender+"','"+age+"','"+mobile+"','"+email+"')");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		out.println(conn.getClass().getName());
	}
}
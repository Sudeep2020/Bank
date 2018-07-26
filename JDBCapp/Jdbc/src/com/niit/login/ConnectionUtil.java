package com.niit.login;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionUtil
{
	public static Connection getConnection()
	{
		try
        {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/form";
		Connection connect = DriverManager.getConnection(url , "root" , "root");
		return connect;
		}
		catch(Exception e)
		{	e.printStackTrace();
			return null;
		}	
    }
}
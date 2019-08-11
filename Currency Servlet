package com.niit.rbuilder.dao;
import java.io.PrintWriter;

import com.mysql.jdbc.Statement;
import com.niit.rbuilder.beans.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Convert")
public class Login extends HttpServlet 
{
	private static final long serialVersionUID = 1L;  
    public Login() 
    {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			PrintWriter out = response.getWriter();
			Connection con;
			Personal p = new Personal();
			
			double value = 0;
			int Id = Integer.parseInt(request.getParameter("CountryID"));
			String CountryName = request.getParameter("CountryName");
			String CurrencyType = request.getParameter("Type");
			int Amt = Integer.parseInt(request.getParameter("Money"));
			
			p.setId(Id);
			p.setCountryName(CountryName);
			p.setCurrencyType(CurrencyType);
			p.setAmount(Amt);
			
			if(CountryName == "India" && CurrencyType == "Soudi Arabia" && Amt != 0)
			{
				value = Amt * 18.94;
			}
			else if(CountryName == "India" && CurrencyType == "USA" && Amt != 0)
			{
				value = Amt * 71.04;
			}
			else if(CountryName == "Soudi Arabia" && CurrencyType == "India" && Amt != 0)
			{
				value = Amt * 0.053;
			}
			else if(CountryName == "Soudi Arabia" && CurrencyType == "USA" && Amt != 0)
			{
				value = Amt * 71.04;
			}
			else if(CountryName == "USA" && CurrencyType == "India" && Amt != 0)
			{
				value = Amt * 0.014;
			}
			else if (CountryName == "USA" && CurrencyType == "Soudi Arabia" && Amt != 0)
			{
				value = Amt * 3.75;
			}
			try
			{
				String Query1 = ("INSERT INTO `country_details`(CountryID,CountryName,CurrencyType,ExchangeValue)"
				+ "value('"+p.getId() + "','"+p.getCountryName()+ "','"+p.getCurrencyType() + value);
				con = DBConnector.getConnection();
				java.sql.Statement s = con.createStatement();
				s.executeUpdate(Query1);
				
				String Query2 = ("select * from `country_details`(CountryID,CountryName,CurrencyType,ExchangeValue)");
				PreparedStatement ps = con.prepareStatement(Query2);
				ps.setLong(1,p.getId());
				ps.setString(2,p.getCountryName());
				ps.setString(3,p.getCurrencyType());
				ps.setLong(4,value);
				ResultSet rs = ps.executeQuery();
				
			con.close();																																																																																					
			}
			catch(SQLException se)																																																																																	
			{
				System.out.println("SQL Exception");
			}
	}
}

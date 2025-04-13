package com.LearnJDBC;
import java.sql.*;
public class JDBCPrograms {
		public static void main(String[] args)
		{
			try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("Drivers Loaded successfully");
				}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
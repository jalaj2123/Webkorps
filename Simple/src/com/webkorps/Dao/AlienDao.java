package com.webkorps.Dao;
import com.webkorps.model.Alien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

	public class AlienDao {

		public Alien getAlien(int aid)
			{
			Alien a=new Alien();
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mvc","root","1234");
			Statement st=con.createStatement();
			//ps.setInt(1, aid);
			ResultSet rs=st.executeQuery("select * from maven where aid=" +aid);
			if(rs.next())
			{
			a.setAid(rs.getInt("aid"));
			a.setAname(rs.getString("aname"));
			a.setTech(rs.getString("tech"));
			}
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
			return a;
			
			}
		
	}



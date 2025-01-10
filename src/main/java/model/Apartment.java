package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class Apartment {
public String signup(String name,String email,String phone,String password) {
	PreparedStatement ps;
	String status="";
	try {
		Statement st=null;
		ResultSet rs=null;
		st = con.createStatement();
		rs = st.executeQuery("select * from customer where email='" + email + "';");
		boolean b=rs.next();
		if(b) 
			status="existed";
		else {
			ps=(PreparedStatement) con.preparedStatement("insert into customer values(0,?,?,?,?,now())");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, phone);
			ps.setString(4, password);
			int a=ps.executeUpdate();
			if(a>0) 
				status="success";
			else 
				status="failed";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	}
	
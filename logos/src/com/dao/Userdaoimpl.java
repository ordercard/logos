package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Users;
import com.util.JdbcUtil;

public class Userdaoimpl {

	public boolean add(Users u ,JdbcUtil jj ) {
		// TODO Auto-generated method stub
		String sql ="insert into user values(0,?,?,?,?,?,?,?,?,?,?)";
		List list =new ArrayList();
		list.add(u.getUsername());
		list.add(u.getPassword());
		list.add(u.getStreet1());
		list.add(u.getStreet2());
		list.add(u.getCity());
		list.add(u.getZip());
		list.add(u.getEmail());
		list.add(u.getHomephone());
		list.add(u.getCellphone());
		list.add(u.getOfficephone());
		 boolean  s= jj.updateByPrearedStatement(sql, list);
		
		return s;
		
	}

	public boolean hasuser(String username, String password, JdbcUtil uu) {
		// TODO Auto-generated method stub
		String sql = "select * from user where username=? and password=?";
		List list =new ArrayList();
		list.add(username);
		list.add(password);
		boolean  a= uu.check(sql,list);
		return a;
		
		
		
		
	}

	public  List <Users> gituser(JdbcUtil uu, String name) throws SQLException {
		// TODO Auto-generated method stub
		String sql="select * from user where username=?";
		List list =new ArrayList();
		List lists =new ArrayList();
		lists.add(name);
		 ResultSet rs=uu.queryByPreparedStatement(sql, lists);
		
		rs.next();
		Users ss=new Users();
			ss.setUserid(rs.getInt("userid"));
	        ss.setUsername(rs.getString("username"));
	      //  ss.setPassword(rs.getString("password"));
		    ss.setStreet1(rs.getString("street1"));
		    ss.setStreet2(rs.getString("street2"));
		    ss.setCity(rs.getString("city"));
		    ss.setZip(rs.getString("zip"));
		    ss.setEmail(rs.getString("email"));
		    ss.setHomephone(rs.getString("homephone"));
		    ss.setCellphone(rs.getString("cellphone"));
		    ss.setOfficephone(rs.getString("officephone"));
  
		list.add(ss);
		return list;
	}

	public boolean updates(JdbcUtil uu, Users us) {
		// TODO Auto-generated method stub
		String sql="update user set street1=?,street2=?,city=?,zip=?,email=?,homephone=?,cellphone=?,officephone=? where userid=?";
		List list =new ArrayList();
	
	//	list.add(us.getPassword());
		list.add(us.getStreet1());
		list.add(us.getStreet2());
		list.add(us.getCity());
		list.add(us.getZip());
		list.add(us.getEmail());
		list.add(us.getHomephone());
		list.add(us.getCellphone());
		list.add(us.getOfficephone());
		list.add(us.getUserid());
		 boolean  s=uu.updateByPrearedStatement(sql, list);
			
			return s;
		
	}
	
	public boolean updatesss(JdbcUtil uu, Users us) {
		// TODO Auto-generated method stub
		String sql="update user set password=? where userid=?";
		List list =new ArrayList();
	System.out.println("dao层"+us.getPassword()+"ddddddddddddddddddd"+us.getUserid());
	list.add(us.getPassword());
	list.add(us.getUserid());	
		 boolean  s=uu.updateByPrearedStatement(sql, list);
			
			return s;
		
	}

	public boolean hasusername(String username, JdbcUtil uu) {
		// TODO Auto-generated method stub
		String sql = "select * from user where username=?";
		List list =new ArrayList();
		list.add(username);
		
		boolean  a= uu.check(sql,list);
		return a;
	}
	
	

	
}

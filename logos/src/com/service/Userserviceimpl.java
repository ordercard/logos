package com.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.dao.Userdaoimpl;
import com.pojo.Users;
import com.util.JdbcUtil;

public class Userserviceimpl {

	public boolean register(Users u) {
		
		boolean bo=true;
		// TODO Auto-generated method stub
		Userdaoimpl dao =new  Userdaoimpl();
		
		JdbcUtil  uu=new JdbcUtil();
	   try {
		Connection conn= uu.getConnection();
			            dao.add(u,uu);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		    finally{
		    	uu.close();
		    }
	
	    return bo;
		
	}
	
	public boolean checkuser(String username, String password) {  
		
		Userdaoimpl dao =new  Userdaoimpl();
		JdbcUtil  uu=new JdbcUtil();
		Connection conn= uu.getConnection();
		      boolean aa=dao.hasuser(username,password,uu);
		
		return aa;
		// TODO Auto-generated method stub
		
	}

 public  List <Users> fixuser(String name){
	 List <Users> us=null;
	 Userdaoimpl dao =new  Userdaoimpl();
		JdbcUtil  uu=new JdbcUtil();
		uu.getConnection();
		try {
			us= dao.gituser( uu,name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(us==null){
		System.out.println("修改fix无数据");
		}
		
	return us;
	 
	 
	 
 }
 public  boolean fixuserpass(Users us){
	 Userdaoimpl dao =new  Userdaoimpl();
		JdbcUtil  uu=new JdbcUtil();
		uu.getConnection();
	boolean s=	dao.updatesss(uu,us);
		
		return s;
	 
 }
 
public boolean update(Users us) {
	// TODO Auto-generated method stub
	 Userdaoimpl dao =new  Userdaoimpl();
		JdbcUtil  uu=new JdbcUtil();
		uu.getConnection();
	boolean s=	dao.updates(uu,us);
		
		return s;
		
}

public boolean checkusername(String username) {
	// TODO Auto-generated method stub
	Userdaoimpl dao =new  Userdaoimpl();
	JdbcUtil  uu=new JdbcUtil();
	Connection conn= uu.getConnection();
	boolean aa=dao.hasusername(username,uu);
	
	
	
	
	
	return aa;
}
	
	
	
	
}

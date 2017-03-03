package com.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.pojo.PageModel;
import com.pojo.Product;

public class JdbcUtil {

	private static String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/ecport";
	private String username = "root";
	private String password = "root";
	private Connection connection;
	private PreparedStatement pstm;
	private ResultSet rs;
	
	//加载数据库的驱动
	
	static{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection getConnection(){
		try {
			connection=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
	}
	
	public boolean updateByPrearedStatement(String sql,List<Object> params){///能够执行增加删除修改
		boolean flag=false;
		try {
			pstm=connection.prepareStatement(sql);
			if(params!=null && params.size()>0){
					for(int i=0;i<params.size();i++){
						pstm.setObject(i+1, params.get(i));
					}
			}    
			int rownum=pstm.executeUpdate();
			if(rownum > 0){
				flag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	
	//执行查询的操作
	public ResultSet queryByPreparedStatement(String sql,List<Object> params){
		try {
			pstm=connection.prepareStatement(sql);
			if(params!=null && params.size()>0){
					for(int i=0;i<params.size();i++){
						pstm.setObject(i+1, params.get(i));
					}
			}
			rs=pstm.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	//关闭数据库的连接
	public void close(){
		if(connection!=null){
			try {
				if(rs!=null){
					rs.close();
				}
				if(pstm!=null){
					pstm.close();
				}
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public boolean check(String sql, List params) {
		// TODO Auto-generated method stub
		try {
			pstm=connection.prepareStatement(sql);
			if(params!=null && params.size()>0){
				for(int i=0;i<params.size();i++){
					pstm.setObject(i+1, params.get(i));
				}
		}
			rs=pstm.executeQuery();
			if(rs.next()){
	return true;
			}else{
				
				
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return false;
	}
	
	public PageModel pagefenye(String sql,List ss) throws SQLException{
		PageModel pageModel=null;  
		List<Product> ar=new ArrayList<Product>();
		ResultSet  rs=queryByPreparedStatement(sql,ss);
		
		while(rs.next()){
			Product product = new Product();
			product.setProductid(rs.getInt("productid"));
			product.setName(rs.getString("name"));
			product.setBaseprice(rs.getDouble("baseprice"));
			product.setImages(rs.getString("images"));
			ar.add(product);

		}
        int total=0;  
        ResultSet rs2=pstm.executeQuery("select count(*) from product"); 
        if(rs2.next()){  
            total=rs2.getInt(1);  
        }  
        pageModel=new PageModel();  
        pageModel.setTotalRecords(total);  
        pageModel.setList(ar);  
        System.out.println("测试是否从数据库中拿到数据");
 
    	List arr=pageModel.getList();
	      for (int i = 0; i < arr.size(); i++) {
	  	  Product product=(Product) arr.get(i);
	  	  System.out.println(product.getName());
	  	
	  }
		return   pageModel;

	}

	public PageModel queryByPreparedStatementss(String sql, List lists,
			String name) throws SQLException {
		PageModel pageModel=null;  
		List<Product> ar=new ArrayList<Product>();
		ResultSet  rs=queryByPreparedStatement(sql,lists);
		
		while(rs.next()){
			Product product = new Product();
			product.setProductid(rs.getInt("productid"));
			product.setName(rs.getString("name"));
			product.setBaseprice(rs.getDouble("baseprice"));
			product.setImages(rs.getString("images"));
			ar.add(product);

		}
        int total=0;  
        ResultSet rs2=pstm.executeQuery("select count(*) from product where name='"+name+"'"); 
        if(rs2.next()){  
            total=rs2.getInt(1);  
        }  
        pageModel=new PageModel();  
        pageModel.setTotalRecords(total);  
        pageModel.setList(ar);  
        System.out.println("测试是否从数据库中拿到数据");
 
    	List arr=pageModel.getList();
	      for (int i = 0; i < arr.size(); i++) {
	  	  Product product=(Product) arr.get(i);
	  	  System.out.println(product.getName());
	  	
	  }
		return   pageModel;

	}
	
}

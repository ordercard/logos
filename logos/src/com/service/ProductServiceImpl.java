package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.ProductDaoImpl;
import com.pojo.PageModel;
import com.pojo.Product;
import com.util.JdbcUtil;

public class ProductServiceImpl {
	ProductDaoImpl productdao = new ProductDaoImpl();

	public List<Product> queryAll(String flag) throws SQLException {
		List<Product> list = new ArrayList<Product>();
		JdbcUtil jdbc = new JdbcUtil();
		try {
			jdbc.getConnection();
			list = productdao.queryAll(flag,jdbc);
		}finally{
			jdbc.close();
		}
		return list;
	}
	public List<Product> detail(String productid){
		List<Product> list = new ArrayList<Product>();
		JdbcUtil jdbc = new JdbcUtil();
		jdbc.getConnection();
		try {
			list = productdao.querydetial(productid,jdbc);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			jdbc.close();

		}
		
		return list;
		
		// TODO Auto-generated method stub
	}
public PageModel fenyes(int pages){
	PageModel pg=null;
	JdbcUtil jdbc = new JdbcUtil();
	jdbc.getConnection();
	try {
		 pg= productdao.fenye(pages, jdbc);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		
		jdbc.close();
		
	}
	
	
	
	return pg;
		
	
}
public PageModel search(String productname,int id) {
	
	PageModel pg=null;
	JdbcUtil jdbc = new JdbcUtil();
	jdbc.getConnection();
	 try {
		pg= productdao.querySearch(id, jdbc,productname);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 finally{
			
			jdbc.close();
			
		}
	 
	 return pg;
}



}

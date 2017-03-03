package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.PageModel;
import com.pojo.Product;
import com.util.JdbcUtil;

public class ProductDaoImpl {


	public List<Product> queryAll(String flag,JdbcUtil jdbc ) throws SQLException{
		List<Product> list = new ArrayList<Product>();
		String sql = "select productid,name,baseprice,images from "+flag;
		ResultSet rs = jdbc.queryByPreparedStatement(sql,null);
		while(rs.next()){
			Product product = new Product();
			product.setProductid(rs.getInt("productid"));
			product.setName(rs.getString("name"));
			product.setBaseprice(rs.getDouble("baseprice"));
			product.setImages(rs.getString("images"));
			list.add(product);
		}
		return list;
	}
	public List<Product> querydetial(String productid, JdbcUtil jdbc) throws SQLException {
		List<Product> list = new ArrayList<Product>();
		String sql = "select * from product where productid=?";
		List a=new ArrayList();
		a.add(productid);
		ResultSet rs = jdbc.queryByPreparedStatement(sql,a);
		while(rs.next()){
			Product product = new Product();
			product.setProductid(rs.getInt("productid"));
			product.setName(rs.getString("name"));
			product.setDescription(rs.getString("description"));
			product.setBaseprice(rs.getDouble("baseprice"));
			product.setWriter(rs.getString("writer"));
			product.setPublish(rs.getString("publish"));
			product.setPages(String.valueOf(rs.getInt("pages")));
			product.setImages(rs.getString("images"));
			product.setStock(rs.getInt("stock"));
			list.add(product);
		}
		
		
		return list;
	}
	public PageModel fenye( int pageNo,JdbcUtil jdbc) throws SQLException{
		int pageSize=4;
		List  ss=new ArrayList();
		ss.add((pageNo-1)*pageSize);
		ss.add(pageSize);
		String sql="select * from product limit ?,?";
		 PageModel pg=jdbc.pagefenye(sql,ss);
		 pg.setPageNo(pageNo);  
	        pg.setPageSize(pageSize);  
	    	
		return pg;

	}
	public PageModel querySearch(int pageNo,JdbcUtil jdbc,String name) throws SQLException {
		List<Product> list = new ArrayList<Product>();
		int pageSize=4;
		String sql = "select productid,name,baseprice,images from product where name like ? limit ?,?";
		List lists =new ArrayList();
		lists.add("%"+name+"%");
		lists.add((pageNo-1)*pageSize);
		lists.add(pageSize);
		PageModel pg = jdbc.queryByPreparedStatementss(sql, lists,name);
		pg.setPageNo(pageNo);  
        pg.setPageSize(pageSize);
		return pg;
	}
	
	
	
}

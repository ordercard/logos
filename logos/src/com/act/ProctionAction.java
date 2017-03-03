package com.act;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.pojo.PageModel;
import com.pojo.Product;
import com.pojo.Users;
import com.service.ProductServiceImpl;
import com.service.Userserviceimpl;

public class ProctionAction extends ActionSupport {

	public Users us;
	 public Users getUs() {
			return us;
		}
		public void setUs(Users us) {
			this.us = us;
		}	
public  String update() throws UnsupportedEncodingException
{
	 HttpServletRequest req = ServletActionContext.getRequest();
	 HttpServletResponse rep = ServletActionContext.getResponse();
		req.setCharacterEncoding("UTF-8");
		rep.setCharacterEncoding("UTF-8");
	System.out.println(us.getStreet2());
	System.out.println(us.getCity());
	      Userserviceimpl service=new Userserviceimpl();
	 boolean bo=service.update(us);
	if(bo){
		
		return SUCCESS;
		
	}
	
	return ERROR;
	
}
private List<Product> list;
public List<Product> getList() {
	return list;
}
public void setList(List<Product> list) {
	this.list = list;
}
public String product() throws Exception {
	ProductServiceImpl productService = new ProductServiceImpl();
	this.list = productService.queryAll("product");
	return "success";
	
}
////////////////////////////////////////////显示商品详细信息
private  String productid;
public String getProductid() {
	return productid;
}
public void setProductid(String productid) {
	this.productid = productid;
}
///////////////////////信息进行处理
     public String  detail(){	 
    	 System.out.println(productid);
    	 ProductServiceImpl productService = new ProductServiceImpl(); 
    	         List<Product> ls=productService.detail(this.productid);
    	     	HttpServletRequest req = ServletActionContext.getRequest();
    	     	req.setAttribute("product", ls.get(0));   	
    	     	System.out.println(ls.get(0));
		return SUCCESS;
    	 
     }
     private int id;
     
     
      public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String pagefenye(){
	   if(id==0){
		  id=1; 
		   
	   }
    	  ProductServiceImpl pro = new ProductServiceImpl(); 
    	      PageModel pg= pro.fenyes(this.id);
    	      HttpServletRequest req = ServletActionContext.getRequest();
  	     	req.setAttribute("pgproducts", pg);  
  	     
    	  return SUCCESS;
  
    	  
      }
	private String productname;

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String search() {
		 if(id==0){
			  id=1; 
			   
		   }
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpSession session = req.getSession();
		ProductServiceImpl productService = new ProductServiceImpl();
		 PageModel pg = productService.search(this.productname,id);
		 req.setAttribute("pgproducts", pg);  
		 session.setAttribute("searchname", productname);
	
		return "success";
	}
     
}

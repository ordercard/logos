package com.act;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.service.Userserviceimpl;

public class loginAction extends ActionSupport {

	
	private String username;
	private String password;
	private String val;
	
public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
public   String   doimage() throws Exception{
	
	/**
	 * 
	 */
	int width = 60;

	/**
	 * ��֤��ͼƬ�ĸ߶ȡ�
	 */
	int height = 20;

	/**
	 *
	 */
	int codeCount = 4;
	char[] codeSequence = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	// buffer
	BufferedImage buffImg = new BufferedImage(width, height,
			BufferedImage.TYPE_INT_RGB);
	Graphics2D gd = buffImg.createGraphics();

	// 
	Random random = new Random();

	// 
	gd.setColor(Color.WHITE);
	gd.fillRect(0, 0, width, height);

	//
	gd.setColor(Color.BLACK);
	gd.drawRect(0, 0, width - 1, height - 1);

	//
	gd.setColor(Color.BLACK);
	for (int i = 0; i < 3; i++) {
		int x = random.nextInt(width);
		int y = random.nextInt(height);
		int xl = random.nextInt(12);
		int yl = random.nextInt(12);
		gd.drawLine(x, y, x + xl, y + yl);
	}

	// 
	StringBuffer randomCode = new StringBuffer();

	//
	for (int i = 0; i < codeCount; i++) {
		//
		String strRand = String.valueOf(codeSequence[random.nextInt(10)]);
		gd.setColor(Color.blue);
		gd.drawString(strRand, (i + 1) * 12, 12);

		//
		randomCode.append(strRand);
	}
	// 、
	HttpServletRequest req = ServletActionContext.getRequest();
	HttpServletResponse resp = ServletActionContext.getResponse();
	HttpSession session = req.getSession();
	session.setAttribute("validateCode", randomCode.toString());

	//
	resp.setHeader("Pragma", "no-cache");
	resp.setHeader("Cache-Control", "no-cache");
	resp.setDateHeader("Expires", 0);

	resp.setContentType("image/jpeg");

	// 
	ServletOutputStream sos = resp.getOutputStream();
	ImageIO.write(buffImg, "jpeg", sos);
	sos.close();
	return null;
	
}


      public  String vailte(){
    	  HttpServletRequest req = ServletActionContext.getRequest();	
    		HttpSession session = req.getSession();
    	  Userserviceimpl service=new Userserviceimpl();;
    	  boolean boo= service.checkuser(username,password);
    	  if(boo&&val.equals(session.getAttribute("validateCode"))){
    		  
    		  
    		  session.setAttribute("username", username);
    		   return SUCCESS;
    	  }
    	  else{
  
  
    		  return ERROR;
    	  }
	
	
	
}
    public String checkusernames (){
    	HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out;
    	Userserviceimpl service=new Userserviceimpl();;
  	  boolean boo= service.checkusername(username);
    	if(boo){
    		
			try {
				out = response.getWriter();
				out.println(1);
	    		out.close();	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	
    		
    		
    		
    	}
    	
    	
    	
    	return null;
    	
    	
    	
    	
    	
    	
    }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
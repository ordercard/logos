package itec;

import java.io.IOException;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Users;





/**
 * 
 * 
 * ������ 
 * 
 * @author Administrator
 *
 */

public class interao implements
Filter
{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		
		
		
		HttpServletRequest request1=(HttpServletRequest)request;
		HttpServletResponse rs=(HttpServletResponse)response;
		Users u=(Users)request1.getSession().getAttribute("username");
		System.out.println("有这个用户名");
		
		String uri=request1.getRequestURI();
	    System.out.println(uri);
		
		String path=uri.substring(uri.lastIndexOf("/")+1);
		if(u!=null){
			
			chain.doFilter(request1, rs);
			return;
			
		}
		
	/*	if(path.indexOf("login")!=-1){
			
			chain.doFilter(request1, rs);
			return;
		}*/
		request.getRequestDispatcher("login.jsp").forward(request1, rs);
		
		
		
		
		
		
		//��ʾ�����������ִ��
		//chain.doFilter(request1, rs);
		
		
		
		
		
		
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}

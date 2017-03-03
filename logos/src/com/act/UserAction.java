package com.act;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.pojo.Users;
import com.service.Userserviceimpl;

public class UserAction extends ActionSupport {
	public Users u;
	HttpServletRequest req = ServletActionContext.getRequest();

	public Users getU() {
		return u;
	}

	public void setU(Users u) {
		this.u = u;
	}
	public String add() {
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String userName = req.getParameter("u.street1");
		Userserviceimpl service = new Userserviceimpl();

		boolean bo = service.register(u);
		if (bo) {
			return "true";
		}

		else {

			return "false";
		}

	}

	public String fix() {
		Userserviceimpl service = new Userserviceimpl();
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpSession session = req.getSession();
		String namee = (String) session.getAttribute("username");
		List<Users> list = service.fixuser(namee);

		if (list != null) {
			System.out.println("测试");
			try {
				req.setCharacterEncoding("UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			req.setAttribute("userlist", list);
			return SUCCESS;
		}

		else {

			return ERROR;
		}

	}

	private Users uss;

	public Users getUss() {
		return uss;
	}

	public void setUss(Users uss) {
		this.uss = uss;
	}

	public String xgmm() {

		HttpServletRequest req = ServletActionContext.getRequest();
		HttpSession session = req.getSession();
		String namee = (String) session.getAttribute("username");
		Userserviceimpl service = new Userserviceimpl();
		List<Users> list = service.fixuser(namee);
		int xxxx = list.get(0).getUserid();
		uss.setUserid(xxxx);
		System.out.println("Action++++++++++++" + uss.getUserid()
				+ uss.getPassword());
		boolean bo = service.fixuserpass(uss);

		if (bo) {

			return SUCCESS;

		}

		return ERROR;

	}

	public String xiugai() {

		return SUCCESS;
	}

	public String exit() {
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpSession session = req.getSession();
		session.removeAttribute("username");
		session.invalidate();
		return SUCCESS;
	}

}

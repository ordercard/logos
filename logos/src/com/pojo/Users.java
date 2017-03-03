package com.pojo;



/*
 * `userid` bigint(20) unsigned NOT NULL auto_increment,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `street1` varchar(64) default NULL,
  `street2` varchar(64) default NULL,
  `city` varchar(32) default NULL,
  `zip` varchar(8) default NULL,
  `email` varchar(32) default NULL,
  `homephone` varchar(16) default NULL,
  `cellphone` varchar(16) default NULL,
  `officephone` varchar(16) default NULL,
  PRIMARY KEY  (`userid`),
  KEY `userid` (`userid`)
 */
public class Users {
	
	private  int userid;
	private String username;
	private String password;
	private String password2;
	private String street1;
	private String street2;
	private String city;
	private String zip;
	private String email;
	private String homephone;
	private String cellphone;
	private String officephone;
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username
				+ ", password=" + password + ", street1=" + street1
				+ ", street2=" + street2 + ", city=" + city + ", zip=" + zip
				+ ", email=" + email + ", homephone=" + homephone
				+ ", cellphone=" + cellphone + ", officephone=" + officephone
				+ "]";
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
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHomephone() {
		return homephone;
	}
	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getOfficephone() {
		return officephone;
	}
	public void setOfficephone(String officephone) {
		this.officephone = officephone;
	}
	
	
	
	
}

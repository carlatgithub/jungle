//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : User.java
//  @ Date : 27/12/2013
//  @ Author : 
//
//



package fr.afcepf.atod19.ecommerce.jungle.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table
@Inheritance(strategy=InheritanceType.JOINED )
public class User {
	protected String username;
	protected String password;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Integer id;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
package com.leiyuan.myssh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 用户表实体类
 * 
 * @author HP5
 *
 */
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "sex")
	private String sex;
	@Column(name = "birthday")
	private String birthday;
	@Column(name = "flag")
	private int flag;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String email, String password, String sex, String birthday, int flag) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.sex = sex;
		this.birthday = birthday;
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", sex=" + sex + ", birthday="
				+ birthday + ", flag=" + flag + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

}
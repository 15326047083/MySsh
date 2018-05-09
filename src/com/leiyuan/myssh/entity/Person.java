package com.leiyuan.myssh.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 * Created by XRom On 11/16/2017.11:50 PM
 */
@Entity
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	@Column(name = "created")
	private Long created = System.currentTimeMillis();

	@Column(name = "username")
	private String username;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;

	@Column(name = "remark")
	private String remark;

	@Override
	public String toString() {
		return "Person [id=" + id + ", created=" + created + ", username=" + username + ", address=" + address
				+ ", phone=" + phone + ", remark=" + remark + "]";
	}

	public Person(Long id, Long created, String username, String address, String phone, String remark) {
		// super();
		this.id = id;
		this.created = created;
		this.username = username;
		this.address = address;
		this.phone = phone;
		this.remark = remark;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}

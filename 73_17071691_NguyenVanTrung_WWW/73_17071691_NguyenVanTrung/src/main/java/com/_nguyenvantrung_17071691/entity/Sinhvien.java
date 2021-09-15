/**
 * 
 */
package com._nguyenvantrung_17071691.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
@Entity
@Table(name="Sinhvien")
public class Sinhvien {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "hoTen")
	private String hoTen;
	

	@Column(name = "email")
	private String email;
	
	@Column(name ="maLop")
	private int maLop;
	
	@ManyToOne
	@JoinColumn(name = "maLop",insertable = false, updatable = false)
	private Lop lop;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMaLop() {
		return maLop;
	}

	public void setMaLop(int maLop) {
		this.maLop = maLop;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	public Sinhvien(int id, String hoTen, String email, int maLop, Lop lop) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.email = email;
		this.maLop = maLop;
		this.lop = lop;
	}

	public Sinhvien(String hoTen, String email, int maLop) {
		super();
		this.hoTen = hoTen;
		this.email = email;
		this.maLop = maLop;
	}

	public Sinhvien() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sinhvien [id=" + id + ", hoTen=" + hoTen + ", email=" + email + ", lop_id=" + maLop + ", lop=" + lop
				+ "]";
	}
	
	
}

/**
 * 
 */
package com._nguyenvantrung_17071691.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
@Entity
@Table(name="Lop")
public class Lop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "tenLop")
	private String tenLop;
	
	@JoinColumn(name ="maLop")
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Sinhvien> sinhviens;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public List<Sinhvien> getSinhviens() {
		return sinhviens;
	}

	public void setSinhviens(List<Sinhvien> sinhviens) {
		this.sinhviens = sinhviens;
	}

	public Lop(int id, String tenLop, List<Sinhvien> sinhviens) {
		super();
		this.id = id;
		this.tenLop = tenLop;
		this.sinhviens = sinhviens;
	}

	public Lop(int id, String tenLop) {
		super();
		this.id = id;
		this.tenLop = tenLop;
	}

	public Lop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lop(String tenLop) {
		super();
		this.tenLop = tenLop;
	}

	@Override
	public String toString() {
		return "Lop [id=" + id + ", tenLop=" + tenLop + ", sinhviens=" + sinhviens + "]";
	}
	
	
}

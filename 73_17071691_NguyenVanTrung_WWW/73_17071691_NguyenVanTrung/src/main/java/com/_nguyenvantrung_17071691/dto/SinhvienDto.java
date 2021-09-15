/**
 * 
 */
package com._nguyenvantrung_17071691.dto;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
public class SinhvienDto {
	private int id;

	private String hoTen;

	private String email;

	private int maLop;

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

	public SinhvienDto(String hoTen, String email, int maLop) {
		super();
		this.hoTen = hoTen;
		this.email = email;
		this.maLop = maLop;
	}

	public SinhvienDto(int id, String hoTen, String email, int maLop) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.email = email;
		this.maLop = maLop;
	}

	public SinhvienDto(int id, String hoTen, String email) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.email = email;
	}

	public SinhvienDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SinhvienDto [id=" + id + ", hoTen=" + hoTen + ", email=" + email + ", maLop=" + maLop + "]";
	}

}

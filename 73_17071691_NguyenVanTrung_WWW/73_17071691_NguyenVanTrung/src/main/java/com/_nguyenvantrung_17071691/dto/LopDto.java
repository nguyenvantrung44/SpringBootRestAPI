/**
 * 
 */
package com._nguyenvantrung_17071691.dto;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
public class LopDto {
	private int id;

	private String tenLop;

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

	public LopDto(int id, String tenLop) {
		super();
		this.id = id;
		this.tenLop = tenLop;
	}

	public LopDto(String tenLop) {
		super();
		this.tenLop = tenLop;
	}

	public LopDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LopDto [id=" + id + ", tenLop=" + tenLop + "]";
	}
	
	

}

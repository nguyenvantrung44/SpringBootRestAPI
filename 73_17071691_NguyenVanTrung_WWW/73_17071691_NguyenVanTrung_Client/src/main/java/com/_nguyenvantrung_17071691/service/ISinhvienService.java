/**
 * 
 */
package com._nguyenvantrung_17071691.service;

import java.util.List;

import com._nguyenvantrung_17071691.dto.SinhvienDto;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
public interface ISinhvienService {
	List<SinhvienDto> getAllSinhVienByLop(int id);
	void themSinhVien(SinhvienDto dto,int id);
	void suaSinhvien(int id,SinhvienDto dto);
	void xoaSinhvien(int id);
	SinhvienDto getSinhVienByID(int id);
}

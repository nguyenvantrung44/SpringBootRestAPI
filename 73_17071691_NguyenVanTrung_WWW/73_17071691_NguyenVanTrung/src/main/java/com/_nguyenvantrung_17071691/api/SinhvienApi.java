/**
 * 
 */
package com._nguyenvantrung_17071691.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com._nguyenvantrung_17071691.dto.SinhvienDto;
import com._nguyenvantrung_17071691.service.ISinhvienService;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
@RestController
@RequestMapping("/api/sinhvien")
public class SinhvienApi {
	@Autowired
	private ISinhvienService service;
	
	@GetMapping("{maLop}")
	public Object getSinhVienByLop(@PathVariable("maLop") int maLop) {
		try {
			return new ResponseEntity<List<SinhvienDto>>(service.getAllSinhVienByLop(maLop),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("error",HttpStatus.BAD_REQUEST);
		}
	}
	@GetMapping("/by-id/{maSV}")
	public Object getSinhVienById(@PathVariable("maSV") int maSV) {
		try {
			return new ResponseEntity<SinhvienDto>(service.getSinhVienByID(maSV),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("error",HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/them/{maLop}")
	public Object themSinhVien(@PathVariable("maLop") int maLop, @RequestBody SinhvienDto dto) {
		try {
			service.themSinhVien(dto, maLop);
			return new ResponseEntity<String>("Them thanh cong",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("error",HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/delete/{maSV}")
	public Object xoaSinhVien(@PathVariable("maSV") int maSV) {
		try {
			service.xoaSinhvien(maSV);
			return new ResponseEntity<String>("Xoa thanh cong",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("error",HttpStatus.BAD_REQUEST);
		}
	}
	@PutMapping("/update/{maSV}")
	public Object suaSinhVien(@PathVariable("maSV") int maSV,@RequestBody SinhvienDto dto) {
		try {
			service.suaSinhvien(maSV, dto);
			return new ResponseEntity<String>("Edit thanh cong",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("error",HttpStatus.BAD_REQUEST);
		}
	}
	
}

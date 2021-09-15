/**
 * 
 */
package com._nguyenvantrung_17071691.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com._nguyenvantrung_17071691.dto.SinhvienDto;
import com._nguyenvantrung_17071691.service.ISinhvienService;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
@Controller
@RequestMapping("/sinhvien")
public class SinhvienController {

	@Autowired 
	private ISinhvienService service;
	
	@GetMapping("{maLop}")
	public String getSinhVienByLop(@PathVariable("maLop") int maLop,ModelMap map) {
		map.addAttribute("listsv",service.getAllSinhVienByLop(maLop));
		map.addAttribute("maLop",maLop);
		return "sinhvien";
	}
	@GetMapping("/by-id/{maLop}/{maSV}")
	public String getSinhVienById(@PathVariable("maSV") int maSV,@PathVariable("maLop") int maLop,ModelMap map) {
		map.addAttribute("listsv",service.getAllSinhVienByLop(maLop));
		map.addAttribute("maLop",maLop);
		return "edit";
	}
	@PostMapping("/them/{maLop}")
	public String themSinhVien(@PathVariable("maLop") int maLop,ModelMap map,@ModelAttribute("sinhvien") SinhvienDto  dto) {
		service.themSinhVien(dto, maLop);
		map.addAttribute("maLop",maLop);
		return "redirect:/sinhvien/"+maLop;
	}
	@GetMapping("/delete/{maLop}/{maSV}")
	public String xoaSinhvien(@PathVariable("maSV") int maSV,@PathVariable("maLop") int maLop) {
		service.xoaSinhvien(maSV);
		return "redirect:/sinhvien/"+maLop;
	}
}

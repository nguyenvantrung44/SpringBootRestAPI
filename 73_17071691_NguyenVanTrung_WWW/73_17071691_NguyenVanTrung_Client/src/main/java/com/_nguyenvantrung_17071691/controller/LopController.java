/**
 * 
 */
package com._nguyenvantrung_17071691.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com._nguyenvantrung_17071691.service.ILopService;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
@Controller
@RequestMapping("/lop")
public class LopController {
	@Autowired
	private ILopService lopService;
	
	@GetMapping("")
	public String getAllLop(ModelMap map) {
		map.addAttribute("list",lopService.getAllLop());	
		return "lop";
	}
}

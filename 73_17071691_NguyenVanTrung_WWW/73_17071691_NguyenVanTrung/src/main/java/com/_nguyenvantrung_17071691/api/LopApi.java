/**
 * 
 */
package com._nguyenvantrung_17071691.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com._nguyenvantrung_17071691.dto.LopDto;
import com._nguyenvantrung_17071691.service.ILopService;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
@RestController
@RequestMapping("/api/lop")
public class LopApi {
	@Autowired
	private ILopService lopHocService;
	
	@GetMapping("")
	public Object getAllLop() {
		try {
			return new ResponseEntity<List<LopDto>>(lopHocService.getAllLop(),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("error",HttpStatus.BAD_REQUEST);
		}
	}
}

/**
 * 
 */
package com._nguyenvantrung_17071691.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com._nguyenvantrung_17071691.dto.SinhvienDto;
import com._nguyenvantrung_17071691.service.ISinhvienService;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
@Service
public class SinhvienService implements ISinhvienService{
	@Autowired
	private RestTemplate  restTemplate;
	@Override
	public List<SinhvienDto> getAllSinhVienByLop(int id) {
		ResponseEntity<List<SinhvienDto>> entity= restTemplate.exchange("http://localhost:8080/api/sinhvien/"+id,HttpMethod.GET,
				null,new ParameterizedTypeReference<List<SinhvienDto>>() {
				});
		
		return entity.getBody();
	}

	@Override
	public void themSinhVien(SinhvienDto dto, int id) {
		// TODO Auto-generated method stub
		restTemplate.postForEntity("http://localhost:8080/api/sinhvien/them/"+id, dto, null);
		
	}

	@Override
	public void suaSinhvien(int id, SinhvienDto dto) {
		// TODO Auto-generated method stub
		restTemplate.put("http://localhost:8080/api/sinhvien/update/"+id, dto);
	}

	@Override
	public void xoaSinhvien(int id) {
		// TODO Auto-generated method stub
		restTemplate.delete("http://localhost:8080/api/sinhvien/delete/"+id);
	}

	@Override
	public SinhvienDto getSinhVienByID(int id) {
		ResponseEntity<SinhvienDto> entity= restTemplate.exchange("http://localhost:8080/api/sinhvien/by-id/"+id,HttpMethod.GET,
				null,new ParameterizedTypeReference<SinhvienDto>() {
				});
		
		return entity.getBody();
	}

}

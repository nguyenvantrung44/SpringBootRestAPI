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

import com._nguyenvantrung_17071691.dto.LopDto;
import com._nguyenvantrung_17071691.service.ILopService;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
@Service
public class LopService implements ILopService{
	
	@Autowired
	private RestTemplate  restTemplate;
	
	@Override
	public List<LopDto> getAllLop() {
		ResponseEntity<List<LopDto>> entity= restTemplate.exchange("http://localhost:8080/api/lop",HttpMethod.GET,
				null,new ParameterizedTypeReference<List<LopDto>>() {
				});
		
		return entity.getBody();
	}

}

/**
 * 
 */
package com._nguyenvantrung_17071691.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._nguyenvantrung_17071691.dto.LopDto;
import com._nguyenvantrung_17071691.entity.Lop;
import com._nguyenvantrung_17071691.repository.LopRepository;
import com._nguyenvantrung_17071691.service.ILopService;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
@Service
public class LopService implements ILopService {
	@Autowired
	private LopRepository lophocRe;

	@Override
	public List<LopDto> getAllLop() {
		List<Lop> list = lophocRe.findAll();
		List<LopDto> rs = new ArrayList<LopDto>();
		for (Lop lop : list) {
			rs.add(new LopDto(lop.getId(),lop.getTenLop()));
		}
		return rs;
	}

}

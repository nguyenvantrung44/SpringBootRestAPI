/**
 * 
 */
package com._nguyenvantrung_17071691.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._nguyenvantrung_17071691.dto.SinhvienDto;
import com._nguyenvantrung_17071691.entity.Lop;
import com._nguyenvantrung_17071691.entity.Sinhvien;
import com._nguyenvantrung_17071691.repository.LopRepository;
import com._nguyenvantrung_17071691.repository.SinhvienRepository;
import com._nguyenvantrung_17071691.service.ISinhvienService;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
@Service
public class SinhvienService implements ISinhvienService {
	@Autowired
	private SinhvienRepository svS;

	@Autowired
	private LopRepository lopRp;

	@Override
	public List<SinhvienDto> getAllSinhVienByLop(int id) {
		List<Sinhvien> list = svS.findAll();
		List<SinhvienDto> rs = new ArrayList<SinhvienDto>();
		for (Sinhvien sv : list) {
			if (sv.getMaLop() == id)
				rs.add(new SinhvienDto(sv.getId(), sv.getHoTen(), sv.getEmail(), id));
		}
		return rs;
	}

	@Override
	public void themSinhVien(SinhvienDto dto, int id) {
		// TODO Auto-generated method stub
		Lop l = lopRp.findById(id).orElse(null);
		Sinhvien sv = new Sinhvien(dto.getHoTen(), dto.getEmail(), l.getId());
		svS.save(sv);
	}

	@Override
	public void suaSinhvien(int id, SinhvienDto dto) {
	
		Sinhvien svEdit=svS.findById(id).orElse(null);
		svEdit.setHoTen(dto.getHoTen());
		svEdit.setEmail(dto.getEmail());
		svS.save(svEdit);
	}

	@Override
	public void xoaSinhvien(int id) {
		svS.deleteById(id);

	}

	@Override
	public SinhvienDto getSinhVienByID(int id) {
		// TODO Auto-generated method stub
		Sinhvien sv=svS.findById(id).orElse(null);
		SinhvienDto dto=new SinhvienDto(sv.getId(),sv.getHoTen(),sv.getEmail());
		return dto;
		
	}

}

package com.xworkz.vrihiagro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.vrihiagro.Repository.VrihiAgroRepository;
import com.xworkz.vrihiagro.Repository.VrihiAgroRepositoryImplementation;
import com.xworkz.vrihiagro.dto.VrihiAgroDto;
@Component
public class VrihiAgroServiceImplementation implements VrihiAgroService {
	@Autowired
 VrihiAgroRepository repo;
	@Override
	public boolean save(VrihiAgroDto dto) {
	
		System.out.println("save method is invoked in VrihiAgroServiceImplementation ");
		if(dto!=null) {
			boolean save=	repo.save(dto);	
			return true;
		}
		
		return false;
	}

}

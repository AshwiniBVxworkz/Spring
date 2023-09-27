package com.xworkz.vrihiagro.service;

import org.springframework.stereotype.Component;

import com.xworkz.vrihiagro.dto.VrihiAgroDto;
@Component
public class VrihiAgroServiceImplementation implements VrihiAgroService {

	@Override
	public boolean save(VrihiAgroDto dto) {
		System.out.println("save method is invoked in VrihiAgroServiceImplementation ");
		
		return false;
	}

}

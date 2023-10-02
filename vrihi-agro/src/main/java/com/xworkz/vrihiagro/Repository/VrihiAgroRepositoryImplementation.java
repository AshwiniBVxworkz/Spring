package com.xworkz.vrihiagro.Repository;

import org.springframework.stereotype.Component;

import com.xworkz.vrihiagro.dto.VrihiAgroDto;
@Component
public class VrihiAgroRepositoryImplementation implements VrihiAgroRepository{
	public VrihiAgroRepositoryImplementation() {
	System.out.println("Inside VrihiAgroRepositoryImplemetation");
	}
	
	

	@Override
	public boolean save(VrihiAgroDto dto) {
		System.out.println("save method invoked in repository");
		return true;
	}
	
	

}

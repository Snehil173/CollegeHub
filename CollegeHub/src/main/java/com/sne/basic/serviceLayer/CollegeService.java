package com.sne.basic.serviceLayer;

import java.util.List;
import java.util.Optional;

import com.sne.basic.entity.College;


public interface CollegeService {
	
	public List<College> getAllColleges();
	
	public Optional<College> getCollegeById(Long id);
	


}

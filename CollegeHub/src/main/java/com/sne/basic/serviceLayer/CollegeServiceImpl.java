package com.sne.basic.serviceLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sne.basic.entity.College;
import com.sne.basic.repository.CollegeRepo;

@Service
public class CollegeServiceImpl implements CollegeService {
	
	 @Autowired
	    private CollegeRepo collegeRepository;

	    public List<College> getAllColleges() {
	        return collegeRepository.findAll();
	    }

	    public Optional<College> getCollegeById(Long id) {
	        return collegeRepository.findById(id);
	    }

}

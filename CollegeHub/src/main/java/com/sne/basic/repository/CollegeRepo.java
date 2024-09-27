package com.sne.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sne.basic.entity.College;

public interface CollegeRepo extends JpaRepository<College,Long>{
	
	

}

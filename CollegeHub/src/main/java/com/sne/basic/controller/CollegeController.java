package com.sne.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sne.basic.serviceLayer.CollegeServiceImpl;

import com.sne.basic.entity.College;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CollegeController {
	
	 @Autowired
	    private CollegeServiceImpl collegeService;

	    @GetMapping("/college")
	    public List<College> getAllColleges() {
	        return collegeService.getAllColleges();
	    }

	    @GetMapping("/college/{id}")
	    public ResponseEntity<College> getCollegeById(@PathVariable Long id) {
	        Optional<College> college = collegeService.getCollegeById(id);
	        return college.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

}

package com.sne.basic.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class College {
	
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String accommodationType;
	    private Double accommodationFee;

	    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
	    private List<CourseFee> courseFees;
	    
	    // Getters and Setters

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAccommodationType() {
			return accommodationType;
		}

		public void setAccommodationType(String accommodationType) {
			this.accommodationType = accommodationType;
		}

		public Double getAccommodationFee() {
			return accommodationFee;
		}

		public void setAccommodationFee(Double accommodationFee) {
			this.accommodationFee = accommodationFee;
		}

		public List<CourseFee> getCourseFees() {
			return courseFees;
		}

		public void setCourseFees(List<CourseFee> courseFees) {
			this.courseFees = courseFees;
		}

		public College(Long id, String name, String accommodationType, Double accommodationFee,
				List<CourseFee> courseFees) {
			super();
			this.id = id;
			this.name = name;
			this.accommodationType = accommodationType;
			this.accommodationFee = accommodationFee;
			this.courseFees = courseFees;
		}

		public College() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "id=" + id + ", name=" + name + ", accommodationType=" + accommodationType
					+ ", accommodationFee=" + accommodationFee ;
		}

	 
	    
	    
	}

	


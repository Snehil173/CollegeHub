package com.sne.basic.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CourseFee {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String courseName;
	    private Double fee;
	    private String duration;

	    @ManyToOne
	    @JoinColumn(name = "college_id")
	    @JsonIgnore // Prevent infinite recursion during serialization
	    private College college;

	    // Getters and Setters
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public Double getFee() {
			return fee;
		}

		public void setFee(Double fee) {
			this.fee = fee;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public College getCollege() {
			return college;
		}

		public void setCollege(College college) {
			this.college = college;
		}

		public CourseFee(Long id, String courseName, Double fee, String duration, College college) {
			super();
			this.id = id;
			this.courseName = courseName;
			this.fee = fee;
			this.duration = duration;
			this.college = college;
		}

		public CourseFee() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "id=" + id + ", courseName=" + courseName + ", fee=" + fee + ", duration=" + duration
					+ ", college=" + college  ;
		}

	
	    
	}



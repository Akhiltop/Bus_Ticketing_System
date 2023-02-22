package com.bus.model;

import java.time.LocalDate;

import com.bus.paylord.Stutus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class FeedBack {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer feedBackId;
	
	private Float driverRating;
	private Float serviceRating;
	private Float overallRating;
	
	private String comments;
	
	private LocalDate feedBackDate;
	
	@OneToOne
	private User user;
	
	@OneToOne
	private Bus bus;
	
}
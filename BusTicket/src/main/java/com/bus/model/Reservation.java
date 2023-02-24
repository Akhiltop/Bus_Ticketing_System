package com.bus.model;

import java.sql.Date;

import com.bus.paylord.Status;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class Reservation {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer reservationId;
	 
	 @Enumerated
	 private Status reservation_status;
	 
	 private String reservationType;
	 
	 private Date reservationDate;
	 
	 private String Source;
	 
	 private String destination;
	 

	 @OneToOne(cascade = CascadeType.ALL)
	 private Bus bus;
	 
}

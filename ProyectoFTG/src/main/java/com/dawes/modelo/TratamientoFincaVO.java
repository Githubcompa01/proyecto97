package com.dawes.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "tratamientofincas")

public class TratamientoFincaVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idtratamientofinca;
	private LocalDate fecha;
	@ManyToOne
	@JoinColumn(name = "idtratamiento")
	private TratamientoVO tratamiento;
	
	@ManyToOne
	@JoinColumn(name = "idfinca")
	private FincaVO finca;

}

package com.testo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_expenses", schema="DEMO")
@Setter
@Getter
public class Expense {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String expense;
	private String description;
	private BigDecimal amount;
}

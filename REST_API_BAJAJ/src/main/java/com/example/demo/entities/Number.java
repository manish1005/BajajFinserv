package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_number")
public class Number {

	@Id
	private int num_id;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="roll_Number")
	private String roll_Number;
	@Column
	private int num;
	public Number(int num_id, String roll_Number, int num) {
		super();
		this.num_id = num_id;
		this.roll_Number = roll_Number;
		this.num = num;
	}
	public int getNum_id() {
		return num_id;
	}
	public void setNum_id(int num_id) {
		this.num_id = num_id;
	}
	public String getRoll_Number() {
		return roll_Number;
	}
	public void setRoll_Number(String roll_Number) {
		this.roll_Number = roll_Number;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Number() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

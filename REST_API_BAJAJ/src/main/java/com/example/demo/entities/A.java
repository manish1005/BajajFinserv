package com.example.demo.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbbajaj")
public class A {
	
	@Column
	private boolean status;
	@Id
	private String  user_ID;
	@Column
	private String email_ID;
	@Column
	private String roll_Number;
	//@Column
	//private int [] numbers;
	//@Column
	//List<Integer> numbers=new ArrayList<>();
	//@Column
	//List<String> alphabets=new ArrayList<>();
	
	/*
	 * public List<Integer> number=new ArrayList<>(); public List<String>
	 * alphabets=new ArrayList<>();
	 * 
	 * public PojoTemp() { is_success=true; user_id="john_doe_17091999";
	 * email="john@xyz.com"; roll_number="ABCD123"; }
	 */


	public A(boolean status, String user_ID, String email_ID, String roll_Number) {
		super();
		this.status = status;
		this.user_ID = user_ID;
		this.email_ID = email_ID;
		this.roll_Number = roll_Number;
		//this.numbers = numbers;
		//this.alphabets = alphabets;
	}


	public A() {
		super();
		// TODO Auto-generated constructor stub
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public String getUser_ID() {
		return user_ID;
	}


	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}


	public String getEmail_ID() {
		return email_ID;
	}


	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}


	public String getRoll_Number() {
		return roll_Number;
	}


	public void setRoll_Number(String roll_Number) {
		this.roll_Number = roll_Number;
	}


	/*
	 * public List<Integer> getNumbers() { return numbers; }
	 * 
	 * 
	 * public void setNumbers(List<Integer> numbers) { this.numbers = numbers; }
	 * 
	 * 
	 * public List<String> getAlphabets() { return alphabets; }
	 * 
	 * 
	 * public void setAlphabets(List<String> alphabets) { this.alphabets =
	 * alphabets; }
	 */
	

	/*
	 * @Override public String toString() { return "A [status=" + status +
	 * ", user_ID=" + user_ID + ", email_ID=" + email_ID + ", roll_Number=" +
	 * roll_Number + ", numbers=" + Arrays.toString(numbers) + ", alphabets=" +
	 * Arrays.toString(alphabets) + "]"; }
	 */

}

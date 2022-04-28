package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_alphabet")
public class Alphabet {

	@Id
	private int apha_id;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="email_ID")
	private String email;

	@Column
	private String alpha;
	public Alphabet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alphabet(int apha_id, String email) {
		super();
		this.apha_id = apha_id;
		this.email = email;
	}

	public int getApha_id() {
		return apha_id;
	}

	public void setApha_id(int apha_id) {
		this.apha_id = apha_id;
	}

	

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}

package com.jvmausa.workshopmongo.domain;



import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable{


	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	private String id;
	
	private String name;
	private String email;
	
	public User(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	
}

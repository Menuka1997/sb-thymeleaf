package com.takeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Setter
@Getter

@Data

@AllArgsConstructor
@NoArgsConstructor
public class User {

	private int id;
	private String firstname;
	private String LastName;
	private String Email;
	private String userName;
	private String passWord;
}

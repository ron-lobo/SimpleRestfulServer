package com.ron;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.time.LocalDateTime;

@DatabaseTable(tableName = "users")
public class User {

	@DatabaseField(generatedId = true)
	private int id;

	@DatabaseField
	private String username;

	@DatabaseField
	private String email;

	@DatabaseField
	private LocalDateTime creationDateTime;

	@DatabaseField
	private LocalDateTime updateDateTime;

	public User() {
		// The ORMs (ORMLite/Hibernate/etc) need a no-arg constructor
	}

	public User(String username, String email) {
		// constructor with arguments created for use in our program
		// now we don't need setters in this class
		this.id = -1;
		this.username = username;
		this.email = email;
		this.creationDateTime = LocalDateTime.now();
		this.updateDateTime = LocalDateTime.now();
	}

	public int getId() {
		return this.id;
	}

	public String getUsername() {
		return this.username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getCreationDateTime() {
		return creationDateTime;
	}

	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	@Override
	public String toString() {
		return "id=" + id + ", username=" + username + ", email=" + email +
				", creationDateTime=" + creationDateTime + ", updateDateTime=" + updateDateTime;
	}
}

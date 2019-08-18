package br.biblioteca.livros.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	@Size(min=2, max=100)
	private String username;

	@NotNull
	@Size(min=2, max=100)
	private String password;

	@ManyToOne
	@JoinColumn(name = "id_role")
	private Role role;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User() { }

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", role=" + role + "]";
	}
}

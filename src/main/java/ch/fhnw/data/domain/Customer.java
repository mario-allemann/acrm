package ch.fhnw.data.domain;

import javax.persistence.*;

@Entity
public class Customer {

	// @ tells the Database what to do
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String mobile;
	@ManyToOne
	private Agent agent;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

}

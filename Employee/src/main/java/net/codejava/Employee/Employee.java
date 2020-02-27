package net.codejava.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
@Entity

public class Employee {
	private long id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Address;
	private String Feedback;
	private String Action;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//@Id 
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	

	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getFeedback() {
		return Feedback;
	}
	public void setFeedback(String feedback) {
		Feedback = feedback;
	}
	
	
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action=action;
	}
	
	

}

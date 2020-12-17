package com.example.demo;
import javax.persistence.*;
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int Id;
	@Column(nullable=false)
	private String FirstName;
	@Column(nullable=false)
    private String LastName;
	@Column(nullable=false)
    private String emailId;
	@Column(nullable=false)
    private int age;
	@Column(nullable=false)
    private String password;
    
        
	public User(String firstName, String lastName, String emailId,int age, String password) {
		super();
		this.emailId = emailId;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.age = age;
		this.password = password;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", emailId=" + emailId
				+ ", age=" + age + ", password=" + password + "]";
	}
	
    
    

}

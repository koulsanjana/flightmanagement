package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/home")
	public String hello() {
		return "This is home page";
	}
	
	@RequestMapping("/save-user")
	public String saveUser(@RequestParam String firstName, @RequestParam String lastName,@RequestParam String emailId,@RequestParam int age,@RequestParam String password) {
		//to save user write -
		//http://localhost:8080/save-user?firstName=sanjana&lastName=koul&emailId=koul@gmail.com&age=10&password=auto
		User user= new User(firstName, lastName, emailId, age, password);
		userService.SaveMyUser(user);
		return "User Saved";
	}
}

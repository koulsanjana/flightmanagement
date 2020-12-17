package com.example.demo;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Transactional
@Service
public class UserService {
	
	private final UserRepo userRepo;
	
	public UserService(UserRepo userRepo) {
		this.userRepo= userRepo;
	}

	 public void SaveMyUser(User user){
		userRepo.save(user);
		
	 }
	
}

package com.dhwanil.repositories;

import com.dhwanil.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {
    User user1 = new User("dhwanil@weetechsolution.com", "dhwanil@123");
    this.userRepository.save(user1);
  }

  public List<User> saveUsers(List<User> userList) {
    return this.userRepository.saveAll(userList);
  }

  public List<User> findAll() {
    System.out.println("Result : "+userRepository.findAll());
    return userRepository.findAll();
  }
}

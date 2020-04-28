package com.example.demo;
import java.util.Collection;
import java.util.Optional;

public interface UserService {
	
    Collection getAll();
    User create(User user);
    Optional get(String id);

}
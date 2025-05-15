package com.example.GreetingApp;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting(User user) {
//        return "Hello World";
    	 if (user.getFirstName() != null && user.getLastName() != null) {
             return  user.getFirstName() + " " + user.getLastName();
         } else if (user.getFirstName() != null) {
             return user.getFirstName();
         } else if (user.getLastName() != null) {
             return user.getLastName();
         } else {
             return "DEFAULT_VALUE";
         }
    }
		
	
}

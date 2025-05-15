package com.example.GreetingApp;
import jakarta.persistence.*;

@Entity
@Table(name = "greetings")
public class Greeting {
	 @Id
//	 @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private long id;
    private  String name;
    public Greeting() {}

    public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    

    public String getName() {
        return name;
    }
    public void setName(String name) {
    	this.name= name ;
    }
    

    
    
}
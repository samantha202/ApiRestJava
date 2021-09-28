package net.codejava.ws;

//this class represents the actors of a film
public class Actors {
     //the attributes of the class
	public String fisrtName;
	public String lastName;
	//class constructors
	public Actors() {}
	public Actors(String fisrtName, String lastName) 
	{
		super();
		this.fisrtName = fisrtName;
		this.lastName = lastName;
	}
	//getters and setters
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

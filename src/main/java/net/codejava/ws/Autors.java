package net.codejava.ws;

//this class represents the author of the film to be screened
public class Autors {

 public	String nameA; //this attribut represent the name of the author
 
	public Autors() {}
	 
	public Autors(String nameA) 
	{
	
		this.nameA = nameA;
	}
	public String getNameA() 
	{
		return nameA;
	}
	public void setNameA(String nameA) 
	{
		this.nameA = nameA;
    } 
}

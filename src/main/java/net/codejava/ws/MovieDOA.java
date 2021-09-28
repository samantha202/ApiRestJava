package net.codejava.ws;

public class MovieDOA {
	private static MovieDOA  instance;
	
	public static MovieDOA getInstance()
	{
		if(instance == null) 
		{
			instance = new MovieDOA();
		}
		return instance;
	}
}

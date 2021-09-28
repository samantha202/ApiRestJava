package net.codejava.ws;

//this class represents the address where the film will be screened
public class Adresse {
    //the attributes of the class
	private int number; // this is the nimber of street
	private String way; // the name of street
	private int postalCode; 
	private String town;
	private String country;
	//class constructors
	public Adresse() {}
	public Adresse(int number, String way, int postalCode, String town, String country) {
		this.number = number;
		this.way = way;
		this.postalCode = postalCode;
		this.town = town;
		this.country = country;
	}
	//getters and setters
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((town == null) ? 0 : town.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresse other = (Adresse) obj;
		if (town == null) {
			if (other.town != null)
				return false;
		} else if (!town.equals(other.town))
			return false;
		return true;
	}
}

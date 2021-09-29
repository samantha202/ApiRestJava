package net.codejava.ws;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//the movie class represents the cinematographic projection with as attribute: its duration, the author of the film, the actors, the different days of projection, projection address,description,age min
public class Movie {
	
	public String title;
	private int id;
	private String languages;
	private JourWeek duration;
	private String king;
	private String description;
	public Programes programs;
	private String author;
	public Adresse adr;
	private int minAge;
	private List<Actors> actors;
    private String v;
	
	public Movie(String title, int id, String languages, JourWeek duration, String king,Adresse adr,int minA, String description,Programes programs, String author, List<Actors> actors,String v) {
		this.title = title;
		this.id = id;
		this.languages = languages;
		this.duration = duration;
		this.king = king;
		this.description = description;
		this.programs = programs;
		this.author = author;
		this.actors = actors;
		this.adr = adr;
		this.minAge = minA;
		this.v = v; //the town
		
	}
	public Movie(String title,String languages, JourWeek duration, String king,Adresse adr,int minA, String description,Programes programs, String author, List<Actors> actors,String v) {
		this.title = title;
		this.languages = languages;
		this.duration = duration;
		this.king = king;
		this.description = description;
		this.programs = programs;
		this.author = author;
		this.actors = actors;
		this.adr = adr;
		this.minAge = minA;
		this.v = v;
		
	}
	public String getV() {
		return v;
	}
	public void setV(String v) {
		this.v = v;
	}
	public Movie() 
	{
		
	}
	
	public Movie(String v) 
	{
		this.v = v;
	}
	public Adresse getAdr() {
		return adr;
	}
	public void setAdr(Adresse adr) {
		this.adr = adr;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public Movie(int id) 
	{
		this.id = id; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public JourWeek getDuration() {
		return duration;
	}
	public void setDuration(JourWeek duration) {
		this.duration = duration;
	}
	public String getKing() {
		return king;
	}
	public void setKing(String king) {
		this.king = king;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Programes getPrograms() {
		return programs;
	}
	public void setPrograms(Programes programs) {
		this.programs = programs;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public List<Actors> getActors() {
		return actors;
	}
	public void setActors(List<Actors> actors) {
		this.actors = actors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Movie other = (Movie) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

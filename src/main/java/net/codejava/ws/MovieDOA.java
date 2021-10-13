package net.codejava.ws;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

//the DAO model is an additional layer created to hollow out direct communication between our storage systems and our business objects
public class MovieDOA {
	
	private static  List<Movie> data = new ArrayList<>(); //list of our film screenings
	private static MovieDOA  instance;
	public static Adresse adr1 = new Adresse(34,"rue beaudin",78500,"Paris","France");
	public static Adresse adr2 = new Adresse(2,"rue amiral collet",85000,"Marseille","France");
	public static Adresse adr3 = new Adresse(8,"impasse jussieu",4200,"Lyon","France");
	public static List<Movie> ListTown = new ArrayList<>();
    public static Programes pr1 = new Programes(); //this variable represents the cinema screening program
	public static ArrayList<Actors> act1 = new ArrayList<Actors>();//list of actors

	static {
		   SimpleDateFormat formatter = new SimpleDateFormat("12/05/2020 15:00:00");
		    Date date = new Date(2020,05,02,15,00); 
		    formatter.format(date);
		    Date date1 = new Date(2020,01,10);
		    Date date2 = new Date(2020,01,30);
		    SimpleDateFormat d1 = new SimpleDateFormat("2021-02-01");
		    SimpleDateFormat d2 = new SimpleDateFormat("2021-02-30");
		    
           pr1.setDateString1("10-jan-2021");
           pr1.setDateString2("30-jan-2021");
		   pr1.datDeb = date1;
		   pr1.datFin = date2;
		   //list of projection days
		   pr1.dayListS.add(new JourWeek(12,15,"Monday"));
		   pr1.dayListS.add(new JourWeek(15,12,"Tuesday"));
		   pr1.dayListS.add(new JourWeek(16,12,"Wednesday"));
		    
		  //the datas of our website it's arraylist of course
		  act1.add(new Actors("sean McClory","McClory"));
		  act1.add(new Actors("Richard Widmark","Widmark"));
		  data.add(new Movie("les cheyennes",1,"french",new JourWeek(4,01),"drame",adr2,12,"En 1878 refusant de vivre dans une réserve plusieurs centaines de cheyennes partant direction du dakota ou ils espèrent trouver une vie meilleure.",pr1,"john Ford",act1,"marseille"));
		  data.add(new Movie("la chronique des Bridgerton ",2,"English",new JourWeek(3,15),"romance",adr2,17,"À Londres, pendant la Régence, Daphne Bridgerton, fille aînée d'une puissante dynastie, est censée se trouver un mari, mais la concurrence est rude et ses envies sont ailleurs...",pr1,"chris Van Dusen",act1,"marseille"));
		  data.add(new Movie("Forrest Gump",3,"french",new JourWeek(2,19),"comedie",adr2,16,"Quelques décennies d'histoire américaine, des années 1940 à la fin du XXème siècle, à travers le regard et l'étrange odyssée d'un homme simple et pur, Forrest Gump.",pr1,"Robert Zemeckis",act1,"marseille"));
		  data.add(new Movie("la ligne verte",4,"french",new JourWeek(1,15),"drame",adr3,12,"En 1878 refusant de vivre dans une réserve plusieurs centaines de cheyennes partant direction du dakota ou ils espèrent trouver une vie meilleure.",pr1,"john Ford",act1,"lyon"));
		  data.add(new Movie("le parain",5,"french",new JourWeek(3,15),"fantasique",adr1,18,"Paul Edgecomb, Gardien-chef du pénitencier de Cold Mountain en 1935, était chargé de veiller au bon déroulement des exécutions capitales. Parmi les prisonniers se trouvait un colosse du nom de John Coffey...",pr1,"Frank Darabont",act1,"paris"));
		  data.add(new Movie("12 hommes en colere",6,"english",new JourWeek(1,35),"drame",adr1,20,"En 1945, à New York, les Corleone sont une des cinq familles de la mafia. Don Vito Corleone marie sa fille à un bookmaker. Sollozzo, \"parrain\" de la famille Tattaglia, propose à Don Vito une association dans le trafic de drogue.",pr1,"francis Ford Coppola",act1,"paris"));
		  data.add(new Movie("les Evadés",7,"spanish",new JourWeek(2,15),"drame",adr3,12,"L'amitié d'un jeune banquier condamné à la prison à vie pour le meurtre de sa femme et d'un vétéran de la prison de Shawshank, le pénitencier le plus sévère de l'Etat du Maine.",pr1,"frank Darabont",act1,"lyon"));
		  data.add(new Movie("le seigneur des anneaux",8,"english",new JourWeek(3,15),"fantastique",adr1,19,"Tandis que les ténèbres se répandent sur la Terre du Milieu, Aragorn se révèle être l'héritier caché des rois antiques. Quant à Frodon, toujours tenté par l'Anneau, il voyage à travers les contrées ennemies, se reposant sur Sam et Gollum.",pr1,"Peter Jachson",act1,"paris"));
		  data.add(new Movie("your name",9,"french",new JourWeek(1,50),"drame",adr1,7,"Mitsuha, adolescente coincée dans une famille traditionnelle, rêve de quitter ses montagnes natales pour découvrir la vie trépidante de Tokyo. Elle est loin d’imaginer pouvoir vivre l’aventure urbaine dans la peau de…",pr1,"Makoto Shinkai",act1,"paris"));
		  data.add(new Movie("le chevalier Noir",10,"french",new JourWeek(2,35),"Thriller",adr1,12,"Batman entreprend de démanteler les dernières organisations criminelles de Gotham. Mais il se heurte bientôt à un nouveau génie du crime qui répand la terreur et le chaos dans la ville",pr1,"Christopher Nolan",act1,"paris"));
	    }
	
	private  MovieDOA () 
	{
	}
	
	public static MovieDOA getInstance()
	{
		
		if(instance == null) 
		{
			instance = new MovieDOA();
		}
		return instance;
	}
	
	public List<Movie> listAll()
	{
		return new ArrayList<Movie>(data);
	}
	
	public int add(Movie m) 
	{
		int newId = data.size() + 1;
		m.setId(newId);
		data.add(m);
		 
		 return newId;
	}
	
	public Movie get(int id) 
	{
		Movie movieTofind = new Movie(id);
		
		int index = data.indexOf(movieTofind);
		
		if(index >= 0) 
		{
			return data.get(index);
		}
		return null;
	}
	
	public List<Movie> GetTown(String s) 
	{
		ListTown.clear();
		for(Movie m: data) 
		{
			if(m.getV().equals(s)) {
				ListTown.add(m);
			}
		}
		 return ListTown;	
	}
	
	
	public boolean update(Movie m) 
	{
		int index = data.indexOf(m);
			if(index >= 0) 
			{
				data.set(index,m);
				return true;
			}
		      return false;
	}
	
	 public  boolean delete(int id) 
	 {
		 Movie movieTofind = new Movie(id);
		 int index = data.indexOf(movieTofind);
		 if(index >= 0) 
		 {
			 data.remove(index);
			 return true;
		 }
		 
		 return false;
	 }
	 
	 public static Date getDateWithoutTimeUsingFormat(Date d) 
	 {
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			    
		try {
			 return format.parse(format.format(d));
					
			} catch (ParseException e) {
					e.printStackTrace();
					return new Date();
			}
     }
}

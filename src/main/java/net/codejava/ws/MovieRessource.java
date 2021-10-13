package net.codejava.ws;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("movies")
public class MovieRessource {
 private MovieDOA dao =  MovieDOA.getInstance();
 // this verb http returns the list of movies
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> list() 
	{
		return dao.listAll();
	}
//this http verb returns a movies according to the id	
	@GET
	@Path("{id}")
	public Response get(@PathParam("id") int id) 
	{
		Movie movie = dao.get(id);
		if(movie != null) {
			return Response.ok(movie, MediaType.APPLICATION_JSON).build();
		}else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}
//this verb http returns a movie according to the city of projection
	@GET
	@Path("vil/{ville}")
	public Response get(@PathParam("ville") String ville) 
	{
		List<Movie> movie = dao.GetTown(ville);
		if(movie != null) {
			return Response.ok(movie, MediaType.APPLICATION_JSON).build();
		}else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}
	//this verb http update a movie according to ID
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response update(@PathParam("id") int id, Movie movie) {
		movie.setId(id);
		if(dao.update(movie))
		 return Response.ok().build();
		else
			return Response.notModified().build();
	}
	//this function add a cinematic projection in our arraylist
	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Movie movie) throws URISyntaxException 
	{
		int newMovieId = dao.add(movie);
		 URI uri = new URI("/movies/"+ newMovieId);
		 return Response.created(uri).build();
	}
}


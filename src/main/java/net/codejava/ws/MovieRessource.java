package net.codejava.ws;
import java.util.List;
import javax.ws.rs.GET;
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
//this verb http returns a films according to the city of projection
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
}


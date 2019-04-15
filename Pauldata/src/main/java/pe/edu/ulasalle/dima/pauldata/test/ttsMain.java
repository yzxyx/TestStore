package pe.edu.ulasalle.dima.pauldata.test;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pe.edu.ulasalle.dima.pauldata.tts.library.TtsSpanishDefault;

@Path("/tts")
public class ttsMain {
	/*
	TtsSpanishDefault obj = new TtsSpanishDefault();
	byte[] b = obj.mp3("Ni mierda");*/
	
	@POST
	@Path("/{texto}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response talk(TtsSpanishDefault ttsspanishdefault, @PathParam("texto") String texto) {
		ttsspanishdefault.mp3(texto);
		return Response.status(Response.Status.CREATED).entity(ttsspanishdefault).build();
	}

}

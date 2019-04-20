package org.kishore.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {
	
	
	@GET
	@Path("annotations")
	public String getParamsUsingAnnotations(@MatrixParam("param") String matrixParam) {
		
		return "Matrix param:" +matrixParam;
	}
	
	
	@GET
	@Path("context")
	public String getParamsUsingContext(@Context UriInfo uriInfo) {
		
		String path= uriInfo.getAbsolutePath().toString();
		return "Path: " + path;
	}
	
	
	

}

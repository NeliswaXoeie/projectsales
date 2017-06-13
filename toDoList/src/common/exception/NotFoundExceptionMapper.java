package common.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException>{

	@Override
	public Response toResponse(NotFoundException ex) {
		return Response.status(Status.NOT_FOUND)
				.entity(new ErrorMessage(ex.getMessage(), 404)).build();
	}
 

}

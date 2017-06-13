package common.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

public class ExistExceptionMapper implements ExceptionMapper<ExistException> {

	@Override
	public Response toResponse(ExistException ex) {
		return Response.status(Status.CONFLICT)
				.entity(new ErrorMessage(ex.getMessage(), 409)).build();
	}

}

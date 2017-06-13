package common.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

public class MissingParameterMapper implements
		ExceptionMapper<MissingParameter> {

	@Override
	public Response toResponse(MissingParameter ex) {
		return Response.status(Status.NOT_FOUND)
				.entity(new ErrorMessage(ex.getMessage(), 404)).build();
	}

}

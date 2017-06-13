package api.service;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.dto.Comment;
import api.dto.Member;

import common.exception.ExistException;
import common.exception.InvalidParameter;
import common.exception.MissingParameter;
import common.exception.NotFoundException;
import common.util.FilterBean;

public interface CommentResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Comment createComment(Comment comment, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Member updateComment(Comment comment) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{memberId}")
	List<Comment> getCommentsForTast(@PathParam("memberId") Long id,
			@BeanParam FilterBean filterBean) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter;
}

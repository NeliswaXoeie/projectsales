package api.service;

import java.util.List;

import api.dto.Member;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import common.exception.ExistException;
import common.exception.InvalidParameter;
import common.exception.MissingParameter;
import common.exception.NotFoundException;
import common.util.FilterBean;

@Path("/members")
public interface MemberResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Member createMember(Member member, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Member updateMember(Member member) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter;

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/deactivate/{id}")
	boolean deactivateMember(@PathParam("id") Long id)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	Member getMember(@PathParam("id") Long id) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{name}")
	Member getMemberByName(@PathParam("name") String name)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<Member> getAllMembers(@BeanParam FilterBean filterBean)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;
	

}

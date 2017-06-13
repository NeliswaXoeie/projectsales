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

import api.dto.Task;

import common.exception.ExistException;
import common.exception.InvalidParameter;
import common.exception.MissingParameter;
import common.exception.NotFoundException;
import common.util.FilterBean;

@Path("/tasks")
public interface TaskResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Task createTask(Task task, String principalId) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter;

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Task updateTask(Task task, String principalId) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter;

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/deactivate/{id}")
	boolean deactivateTask(@PathParam("id") Long id, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/complete/{id}")
	boolean completeTask(@PathParam("id") Long id, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	Task getTask(@PathParam("id") Long id) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{name}")
	Task getTaskByName(@PathParam("name") String name)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<Task> getAllTasks(@BeanParam FilterBean filterBean)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/date")
	List<Task> getTasksByDates(@BeanParam FilterBean filterBean)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/due")
	List<Task> getOverdueTasks(@BeanParam FilterBean filterBean)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{memberId}")
	List<Task> getTasksByMemberId(@PathParam("memberId") Long memberId,
			@BeanParam FilterBean filterBean) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{memberId}/comments")
	CommentResource getCommentResource(@PathParam("memberId") Long memberId,
			@BeanParam FilterBean filterBean) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter;

}

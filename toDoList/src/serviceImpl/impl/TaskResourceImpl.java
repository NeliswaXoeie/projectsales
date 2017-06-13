package serviceImpl.impl;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import common.exception.ExistException;
import common.exception.InvalidParameter;
import common.exception.MissingParameter;
import common.exception.NotFoundException;
import common.util.FilterBean;

import api.dto.Task;
import api.service.CommentResource;
import api.service.TaskResource;

public class TaskResourceImpl implements TaskResource{

	@Override
	public Task createTask(Task task, String principalId) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task updateTask(Task task, String principalId) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deactivateTask(Long id, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean completeTask(Long id, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Task getTask(Long id) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task getTaskByName(String name)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getAllTasks(FilterBean filterBean)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getTasksByDates(FilterBean filterBean)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getOverdueTasks(FilterBean filterBean)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getTasksByMemberId(Long memberId,
			@BeanParam FilterBean filterBean) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentResource getCommentResource(@PathParam("memberId") Long memberId,
			@BeanParam FilterBean filterBean) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return new CommentResourceImpl();
	}

}

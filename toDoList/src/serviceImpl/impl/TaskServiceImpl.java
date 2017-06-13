package serviceImpl.impl;

import java.util.Date;
import java.util.List;

import common.exception.ExistException;
import common.exception.InvalidParameter;
import common.exception.MissingParameter;
import common.exception.NotFoundException;

import api.dto.Task;
import api.service.TaskService;

public class TaskServiceImpl implements TaskService {

	@Override
	public Task createTask(Task task, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task updateTask(Task task, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
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
	public Task getTask(Long id) throws NotFoundException, ExistException,
			MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task getTaskByName(String name) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getAllTasks(int start, int numberOfRecords)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getTasksByDates(Date startDate, Date endDate, int start,
			int numberOfRecords) throws NotFoundException, ExistException,
			MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getOverdueTasks(int start, int numberOfRecords)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getTasksByMemberId(long id, int start, int numberOfRecords)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

}

package api.service;

import java.util.Date;
import java.util.List;

import api.dto.Task;

import common.exception.ExistException;
import common.exception.InvalidParameter;
import common.exception.MissingParameter;
import common.exception.NotFoundException;

public interface TaskService {

	Task createTask(Task task, String principalId) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter;

	Task updateTask(Task task, String principalId) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter;

	boolean deactivateTask(Long id, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;
	boolean completeTask(Long id, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	Task getTask(Long id) throws NotFoundException, ExistException,
			MissingParameter, InvalidParameter;

	Task getTaskByName(String name) throws NotFoundException, ExistException,
			MissingParameter, InvalidParameter;

	List<Task> getAllTasks(int start, int numberOfRecords)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	List<Task> getTasksByDates(Date startDate, Date endDate, int start,
			int numberOfRecords) throws NotFoundException, ExistException,
			MissingParameter, InvalidParameter;

	List<Task> getOverdueTasks(int start, int numberOfRecords)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	List<Task> getTasksByMemberId(long id, int start, int numberOfRecords)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

}

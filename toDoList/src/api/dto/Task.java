package api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import common.util.MetaInfo;

@XmlRootElement
@XmlType
public class Task extends MetaInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String description;
	private Date startDate;
	private Date dueDate;
	private boolean status;
	private int priority;
	private Long memeberId;
	private Long parentId;
	@XmlElement
	private List<Comment> comments;

	public Task() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Long getMemeberId() {
		return memeberId;
	}

	public void setMemeberId(Long memeberId) {
		this.memeberId = memeberId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	 public List<Comment> getComments() {
	 if(comments==null){
	 comments=new ArrayList<Comment>();
	 }
	 return comments;
	 }
	 public void setComments(List<Comment> comments) {
	 this.comments = comments;
	 }

}

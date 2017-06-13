package common.util;

import java.util.Date;

import javax.ws.rs.QueryParam;

public class FilterBean {
	
	private @QueryParam("start") int start;
	private @QueryParam("numberOfRecords") int numberOfRecords;
	private @QueryParam("startDate") Date startDate;
	private @QueryParam("enddate") Date enddate;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getNumberOfRecords() {
		return numberOfRecords;
	}
	public void setNumberOfRecords(int numberOfRecords) {
		this.numberOfRecords = numberOfRecords;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	

}

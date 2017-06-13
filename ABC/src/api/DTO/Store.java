package api.DTO;

import java.io.Serializable;

public class Store implements Serializable{

	public Store(String name, int parentID, int iD) {
		
		Name = name;
		ParentID = parentID;
		ID = iD;
	}
	public Store() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getParentID() {
		return ParentID;
	}
	public void setParentID(int parentID) {
		ParentID = parentID;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	String Name;
	int ParentID;
	int ID;
}

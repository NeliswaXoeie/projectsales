package api.DTO;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;
@XmlRootElement
@XmlElement
public class CurrentStock implements Serializable{

	public CurrentStock(int iD, int quantity, boolean refill) {
		
		ID = iD;
		Quantity = quantity;
		Refill = refill;
	}
	public CurrentStock() {
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public boolean isRefill() {
		return Refill;
	}
	public void setRefill(boolean refill) {
		Refill = refill;
	}
	int ID;
	int Quantity;
	boolean Refill;
}

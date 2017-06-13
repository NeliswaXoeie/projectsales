package api.DTO;

import java.io.Serializable;

public class Sales implements Serializable{
	
	public Sales(int iD, int quantity, double totalPrice) {
		
		ID = iD;
		Quantity = quantity;
		TotalPrice = totalPrice;
	}
	public Sales() {
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
	public double getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}
	int ID;
	int Quantity;
	double TotalPrice;
	

}

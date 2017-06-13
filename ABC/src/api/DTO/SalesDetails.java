package api.DTO;

import java.io.Serializable;

public class SalesDetails implements Serializable{

	public SalesDetails() {
		// TODO Auto-generated constructor stub
	}
	public SalesDetails(double unitPrice, int salesID, int unitQuantity) {
	
		UnitPrice = unitPrice;
		SalesID = salesID;
		UnitQuantity = unitQuantity;
	}
	public double getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}
	public int getSalesID() {
		return SalesID;
	}
	public void setSalesID(int salesID) {
		SalesID = salesID;
	}
	public int getUnitQuantity() {
		return UnitQuantity;
	}
	public void setUnitQuantity(int unitQuantity) {
		UnitQuantity = unitQuantity;
	}
	double UnitPrice;
	int SalesID;
	int UnitQuantity;
}

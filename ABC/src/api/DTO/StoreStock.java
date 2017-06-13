package api.DTO;

import java.io.Serializable;

public class StoreStock implements Serializable{
	public StoreStock() {
		// TODO Auto-generated constructor stub
	}
	public StoreStock(int iD, String description, String barcode, String serialNo, boolean stockQuantity) {
		
		ID = iD;
		Description = description;
		Barcode = barcode;
		SerialNo = serialNo;
		StockQuantity = stockQuantity;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getBarcode() {
		return Barcode;
	}
	public void setBarcode(String barcode) {
		Barcode = barcode;
	}
	public String getSerialNo() {
		return SerialNo;
	}
	public void setSerialNo(String serialNo) {
		SerialNo = serialNo;
	}
	public boolean isStockQuantity() {
		return StockQuantity;
	}
	public void setStockQuantity(boolean stockQuantity) {
		StockQuantity = stockQuantity;
	}
	int ID;
	String Description;
	String Barcode;
	String SerialNo;
	boolean StockQuantity;
	 

}

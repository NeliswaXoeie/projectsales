package api.DTO;

import java.io.Serializable;

public class Stock implements Serializable {

	public Stock(int iD, String name, int stockCode, String measurementType) {
		
		ID = iD;
		Name = name;
		StockCode = stockCode;
		MeasurementType = measurementType;
	}
	public Stock() {
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getStockCode() {
		return StockCode;
	}
	public void setStockCode(int stockCode) {
		StockCode = stockCode;
	}
	public String getMeasurementType() {
		return MeasurementType;
	}
	public void setMeasurementType(String measurementType) {
		MeasurementType = measurementType;
	}
	int ID;
	String Name;
	int StockCode;
	String MeasurementType;
	
	
}

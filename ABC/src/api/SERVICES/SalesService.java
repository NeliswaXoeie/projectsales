package api.SERVICES;

import java.util.ArrayList;
import java.util.List;

import api.DTO.Sales;

public interface SalesService {

	
	

	List <String> Sales=new ArrayList<String>();
	List <String> SalesDetails=new ArrayList<String>();
	public Sales recordSales(double Sales,int PriceID);
	public Sales voidSales(double Sales,int ID);
	public Sales returnSales(double Sales,int ID);
	public Sales viewReports();
	public Sales getAllSales(String start,int num);
	
}


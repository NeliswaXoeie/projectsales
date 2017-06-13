package api.SERVICES;

import java.util.ArrayList;
import java.util.List;

import api.DTO.Stock;

public interface StockService {

	List <String> Stock=new ArrayList<String>();
	//CRUD
	public Stock Createstock (Stock stock);
	public Stock Removestock(Stock stock);
	public Stock Updatestock(Stock stock);
	public Stock Deletestock (Stock stock);
	
	public Stock AcceptDelivery(Stock stock);
	public Stock Transfer(Stock stock);
	public Stock Adjust(Stock stock);
	public Stock RecoverStock(Stock stock);
}

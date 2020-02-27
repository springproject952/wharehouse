package in.nit.dao;

import java.util.List;

import in.nit.model.ShipmentType;

public interface IShipmentTypeDao {
	Integer saveShipmentType(ShipmentType s);
	
	  List<ShipmentType>getAllShipmentType();
	  
		 public void deleteShipmentType(Integer id);
		 
		 ShipmentType getOneShipmentType(Integer id);
		 
		 void updateShipmentType(ShipmentType ob);
		
	}



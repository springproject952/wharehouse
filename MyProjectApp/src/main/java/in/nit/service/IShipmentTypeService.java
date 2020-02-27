package in.nit.service;

import java.util.List;

import in.nit.model.ShipmentType;

public interface IShipmentTypeService {
	Integer saveShipmentType(ShipmentType s);
	List<ShipmentType>getAllShipmentType();
	public void deleteShipmentType(Integer id);
	ShipmentType getOneShipmentType(Integer id);
	 void updateShipmentType(ShipmentType ob);
	
}

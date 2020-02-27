package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentType;
import in.nit.service.IShipmentTypeService;
@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {
	@Autowired

	private   IShipmentTypeDao dao;
	@Override
	@Transactional
	public Integer saveShipmentType(ShipmentType s) {

		return dao.saveShipmentType(s);
	}
	@Override
	@Transactional(readOnly = true)
	public List<ShipmentType> getAllShipmentType() {
		System.out.println("2");
		List<ShipmentType>list=dao.getAllShipmentType();
		Collections.sort(list,(o1,o2)->o1.getShipId()-o2.getShipId());
		return list;
	}
	@Transactional
	@Override
	public void deleteShipmentType(Integer id) {

		dao.deleteShipmentType(id);
	}
	@Override
	@Transactional(readOnly = true)
	public ShipmentType getOneShipmentType(Integer id) {
		return dao.getOneShipmentType(id);
	}
	@Override
	@Transactional()
	public void updateShipmentType(ShipmentType ob) {
	 dao.updateShipmentType(ob);
	}
}

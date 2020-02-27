package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentType;

@Repository
public class ShipmentTypeDaoImlp implements IShipmentTypeDao {
	@Autowired
private  HibernateTemplate ht;
	public Integer saveShipmentType(ShipmentType s) {

		return (Integer)ht.save(s);
	}
	@Override
	public List<ShipmentType> getAllShipmentType() {
            System.out.println("3");
		
		return ht.loadAll(ShipmentType.class);
	}
	@Override
	public void deleteShipmentType(Integer id) {
     ht.delete(new ShipmentType(id));
		
	}
	@Override
	public ShipmentType getOneShipmentType(Integer id) {

		return ht.get(ShipmentType.class, id);
	}
	@Override
	public void updateShipmentType(ShipmentType ob) {
		ht.update(ob);
	}

}

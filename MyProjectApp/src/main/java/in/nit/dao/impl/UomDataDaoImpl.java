package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IUomDataDao;
import in.nit.model.CreateUom;
import in.nit.model.ShipmentType;
@Repository
public class UomDataDaoImpl implements IUomDataDao {
	@Autowired
	private HibernateTemplate ht;
	public Integer saveUomData(CreateUom u) {

		return (Integer)ht.save(u);
	}
	@Override
	public List<CreateUom> getAllUomtype() {

		return ht.loadAll(CreateUom.class);
	}
	@Override
	public void deleteUom(Integer id) {
      ht.delete(new CreateUom(id));
	}
	@Override
	public CreateUom getOneUom(Integer id) {
       
		return ht.get(CreateUom.class, id);
	}
	@Override
	public void updateUom(CreateUom ob) {
     ht.update(ob);
		
	}
	
}

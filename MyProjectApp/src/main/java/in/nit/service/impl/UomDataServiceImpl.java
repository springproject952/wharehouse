package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.type.TrueFalseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IUomDataDao;
import in.nit.model.CreateUom;
import in.nit.model.ShipmentType;
import in.nit.service.IUomDataService;
@Service
public class UomDataServiceImpl implements IUomDataService {
	@Autowired
	private IUomDataDao dao;
	@Transactional
	public Integer saveUomData(CreateUom u) {

		return dao.saveUomData(u);
	}
	@Transactional
	@Override
	public List<CreateUom> getAllUomtype() {
		List<CreateUom>list=dao.getAllUomtype();
		Collections.sort(list,(o1,o2)->o1.getUomId()-o2.getUomId());
		return list;
	}
	@Override
	@Transactional
	public void deleteUom(Integer id) {
         dao.deleteUom(id);
		
	}
	@Transactional(readOnly=true)
	@Override
	public CreateUom getOneUom(Integer id) {

		return dao.getOneUom(id);
	}
	@Override
	@Transactional()
	public void updateUom(CreateUom ob) {

		dao.updateUom(ob);
	}

}

package in.nit.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IEmployeeDao;
import in.nit.model.Employee;
@Repository

public class EmployeeDaoImpl implements IEmployeeDao {
	@Autowired
	private HibernateTemplate ht; 
		
	@Override
	public Integer saveEmplyee(Employee e) {

		
		return (Integer)ht.save(e);
	}

}

package in.nit.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IEmployeeDao;
import in.nit.model.Employee;
import in.nit.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao;

	@Override
	@Transactional
	public Integer saveEmployee(Employee e) {

		return (Integer)dao.saveEmplyee(e);
	}
}

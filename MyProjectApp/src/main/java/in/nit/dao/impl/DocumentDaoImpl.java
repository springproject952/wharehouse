package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IDocumentDao;
import in.nit.model.Document;
@Repository
public class DocumentDaoImpl implements IDocumentDao{
	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer SaveDocument(Document data1) {
 
		return (Integer)ht.save(data1);
	}
  @Override
public List<Object[]> getFileIdAndNames() {
   String hql="select fileId ,fName from in.nit.model.Document";
	return (List<Object[]>) ht.find(hql);
}
public Document getOneDocument(Integer id) {
	// TODO Auto-generated method stub
	return ht.get(Document.class,id);
}
}

package in.nit.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IDocumentDao;
import in.nit.model.Document;
import in.nit.service.IDocumentService;
@Service
public class DocumentServiceImpl implements IDocumentService {
	@Autowired
	private IDocumentDao dao;
	
	@Override
	@Transactional
	public Integer SaveDocument(Document data1) {
		// TODO Auto-generated method stub
		return  dao.SaveDocument(data1);
	}
@Override
 @Transactional(readOnly = true)
 	public List<Object[]> getFileIdAndNames() {
     //  String sql="select fileId,fName from in.nit.model.Document";
 		return dao.getFileIdAndNames();
 	}	

 	@Override
 	//@Transactional(readOnly = true)
 	public Document getOneDocument(Integer id) {
 		// TODO Auto-generated method stub
 		return dao.getOneDocument(id);
 	}
}

package in.nit.service;

import java.util.List;

import in.nit.model.Document;

public interface IDocumentService {

	Integer SaveDocument(Document data1);
   
	public List<Object[]> getFileIdAndNames();
	public Document getOneDocument(Integer id);
	
}

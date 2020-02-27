package in.nit.dao;

import java.util.List;

import in.nit.model.Document;

public interface IDocumentDao {

	Integer SaveDocument(Document data1);
	public List<Object[]> getFileIdAndNames();
	public Document getOneDocument(Integer id);
}

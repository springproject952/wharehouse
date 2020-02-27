package in.nit.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import in.nit.model.ShipmentType;

public class ShipmentTypeExcelview extends AbstractXlsxView {
	protected void buildExcitdocument
	(Map<String,Object>model,Workbook workbook,
			HttpServletRequest request,HttpServletResponse response) 
					throws Exception{
		//filename******
	//	response.addHeader("Content-Disposition"
	//			,"attachment:filename=abcd.xlsx");
		Sheet s=workbook.createSheet("SHIPMENT TYPES");
		//CONSTRUCT-ROW
		setHeader(s);
		//read model data
		List<ShipmentType>list= (List<ShipmentType>)model.get("list");
		setBody(s,list);
	}
	private void setHeader(Sheet s) {
		Row r=s.createRow(0);
		r.createCell(1).setCellValue("ID");
		r.createCell(2).setCellValue("MODE");
		r.createCell(3).setCellValue("ENABLED");
		r.createCell(3).setCellValue("GRADE");
		r.createCell(4).setCellValue("NOTE");
	}
	private void setBody(Sheet s,List<ShipmentType>list) {
		int count=1;
		for(ShipmentType st:list) {
			Row r=s.createRow(count ++);
			r.createCell(0).setCellValue(st.getShipId());
			r.createCell(1).setCellValue(st.getShipMode());
			r.createCell(1).setCellValue(st.getShipCode());
			r.createCell(1).setCellValue(st.getEntbShip());
			r.createCell(1).setCellValue(st.getShipGrad());
			r.createCell(1).setCellValue(st.getShipDisc());
		}
	}
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
	}

}

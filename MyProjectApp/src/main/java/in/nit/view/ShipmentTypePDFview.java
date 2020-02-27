package in.nit.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import in.nit.model.ShipmentType;


public class ShipmentTypePDFview extends AbstractPdfView {

	@Override
	public void buildPdfDocument(Map<String, Object> model,
			Document document, PdfWriter writer,
			HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		//Download file
		response.addHeader("Content-Disposition", "attachment;filename=shipment.pdf");
	//**********create element
		Paragraph p=new Paragraph("WELCOME TO SHIPMENTTYPEDSF ");
		//add Extenet to document*******
		document.add(p);
		//read data from Model*******
		List<ShipmentType>list=(List<ShipmentType>)model.get("list");
		//creating table with no od colums******
		PdfPTable df=new PdfPTable(6);
		df.addCell("id");
		df.addCell("MODE");
		df.addCell("CODE");
		df.addCell("ENABLE");
		df.addCell("GRAE");
		df.addCell("NOTE");
		//adding data to table*****
		for(ShipmentType st:list) {
			df.addCell(st.getShipId().toString());
			df.addCell(st.getShipMode());
			df.addCell(st.getShipCode());
			df.addCell(st.getEntbShip());
			df.addCell(st.getShipGrad());
			df.addCell(st.getShipDisc());
			
		}
		//add table to document
		document.add(df);
			//print data and time
		document.add(new Paragraph(new Date().toString()));
		
	}
		
}

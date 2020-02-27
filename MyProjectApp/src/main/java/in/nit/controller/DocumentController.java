package in.nit.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import in.nit.model.Document;
import in.nit.service.IDocumentService;
@Controller
public class DocumentController {
	@Autowired
	private IDocumentService service;	
	//sow Document uplood page
	@RequestMapping("/show")
	public String showUploadPage( Model model) {
		List<Object[]>list=service.getFileIdAndNames();
		model.addAttribute("list", list);
		return "Documents";
	}
	// 2 upload data into DB
	@RequestMapping(value="/upload",
			method = RequestMethod.POST)
	public String saveData(@RequestParam Integer fileId,
			@RequestParam CommonsMultipartFile fileOb,Model model) {
		if(fileId!=null) {
			Document d=new Document();
			d.setFileId(fileId);
			d.setFName(fileOb.getOriginalFilename());
			d.setFData(fileOb.getBytes());
			service.SaveDocument(d);
	//String msg=fileId+"is Uploaded";
			model.addAttribute("msg", fileId+"docs is uploaded");
		}
		return "redirect:show";
	}
	@RequestMapping("/download")
	public void doDowntoad(
			@RequestParam Integer fid,HttpServletResponse resp){
		//Read one object basid on id
		Document doc=service.getOneDocument(fid);
		resp.addHeader("Content-Disposition", "attachment;filename="+doc.getFileId());
		try {

			//copy data to os
			FileCopyUtils.copy(doc.getFData(), resp.getOutputStream());
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}




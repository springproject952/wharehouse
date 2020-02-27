package in.nit.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.CreateUom;
import in.nit.service.IUomDataService;
@Controller
@RequestMapping("uom")
public class UomTypeDataController {
	@Autowired
private IUomDataService service;
	@RequestMapping("uomdata")
	public String showUomData() {
		return "UomRegister";
	}
	@RequestMapping(value = "/saved",method = RequestMethod.POST)
	public String saveUomData(@ModelAttribute CreateUom createUom, Model model) {
		Integer id=service.saveUomData(createUom);
		String message="CreateUom'"+id+"'saved";
		model.addAttribute("Message", message);
		return "UomRegister";
		
	}
	@RequestMapping("/all")
	public String getAllUomtype(Model model) {
		List<CreateUom>list=service.getAllUomtype();
         model.addAttribute("list",list); 		
		return "UomData";
	}
	//------------------------------------------
	@RequestMapping("/delete")
	public String deleteUom(
			@RequestParam("sid")Integer id,Model model) {
		service.deleteUom(id);
		String message="CreateUom'"+id+"'delete";
		model.addAttribute("message", message);
		List<CreateUom>list=service.getAllUomtype();
		model.addAttribute("list", list);
		return "UomData";
	}
	//--------------------------------------------
	
	@RequestMapping("/edit") 
	public String ShowEditpag(
			@RequestParam("sid")Integer id,Model model)
	{                  
		CreateUom createUom=service.getOneUom(id);
		
		model.addAttribute("createUom", createUom);
		return"uomTypeEdit";
	}
	
	@RequestMapping(value ="/update",method = RequestMethod.POST)
	public String updateUom(@ModelAttribute 
			CreateUom createUom,
			Model model) {
	service.updateUom(createUom);
	String message="createUom'"+createUom.getUomId()+"'updat";
	model.addAttribute(message, message);
	List<CreateUom>list=service.getAllUomtype();
	model.addAttribute("list", list);
	return "UomData";


	}
	//---------------------------------------
	
	@RequestMapping("/view")
	public String  showAll(@RequestParam("sid")Integer id,Model model)
			 {
		CreateUom createUom=service.getOneUom(id);
		model.addAttribute("ob", createUom);
		return "UomTypeView";
		
	}
	
}

package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.model.ShipmentType;
import in.nit.service.IShipmentTypeService;
import in.nit.view.ShipmentTypeExcelview;
import in.nit.view.ShipmentTypePDFview;
@Controller
@RequestMapping("shipment")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;
	//Farm Backing object
	@RequestMapping({"/register"})
	public String showRegister(Model model
			) {
		model.addAttribute("shipmentType",new ShipmentType());
		return "ShipmentTypeRegister";

		/* This Method Save 
		 */
	}
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveShipment(
			@ModelAttribute ShipmentType shipmentType,Model model) {
		Integer id=service.saveShipmentType(shipmentType);
		String message="shipmentType'"+id+"'saved";
		model.addAttribute("Message",message);
		return "ShipmentTypeRegister";
		/*
		 * show the all data  
		 */
	}
	@RequestMapping("/all")
	public String getAllShipmentType(Model model) {
		System.out.println("1");
		List<ShipmentType>list=service.getAllShipmentType();
		model.addAttribute("list", list);
		return "ShipmentTypeData";
	}
	//****--Delete The Data
	@RequestMapping("/delete")
	public String deleteShipment(
			@RequestParam("sid")Integer id,Model model) {
		service.deleteShipmentType(id);
		String message="Shipment'"+id+"'delete";
		model.addAttribute("message", message);
		List<ShipmentType>list=service.getAllShipmentType();
		model.addAttribute("list", list);
		return "ShipmentTypeData";

	}
	//*** The Method use the Edit the data
	@RequestMapping("/edit") 
	public String ShowEditpag(
			@RequestParam("sid")Integer id,Model model)
	{                  
		ShipmentType st=service.getOneShipmentType(id);
		model.addAttribute("shipmentType", st);
		return"shipmentTypeEdit";
	}
	//********This Method  edit Data save*******************

	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updateShipmentType(@ModelAttribute 
			ShipmentType shipmentType,
			Model model)
	{service.updateShipmentType(shipmentType);
	String message="shipmentType'"+shipmentType.getShipId()+"'updat";
	model.addAttribute(message, message);
	List<ShipmentType>list=service.getAllShipmentType();
	model.addAttribute("list", list);
	return "ShipmentTypeData";
	}
	/*This Method use view All Data******
	 *
	 */
	@RequestMapping("/view")
	public String  ShowOneShipment(@RequestParam("shipId")
	Integer id,Model model)
	{
		ShipmentType st=service.getOneShipmentType(id);
		model.addAttribute("ob", st);
		return "ShipmentTypeView";

	}
	/* 
	 * Excel--
	 */
	@RequestMapping("/excel")
	public ModelAndView ShowExcel() {
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypeExcelview());
		//
		List<ShipmentType>list=service.getAllShipmentType();
		m.addObject("list", list);
		return m;


	}
	//*****--PDF---
	@RequestMapping("/pdf")
	public ModelAndView showPdf() {
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypePDFview());
		List<ShipmentType>list=service.getAllShipmentType();
		//send data to pdf file
		m.addObject("list",list);
		return m;

	}

}	

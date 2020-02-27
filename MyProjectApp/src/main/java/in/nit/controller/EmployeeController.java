package in.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.nit.model.Employee;
import in.nit.service.IEmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	//This Method use to ---URL Register===GET type
	@Autowired
	IEmployeeService service;
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute Employee emp,Model model) {
		Integer id=service.saveEmployee(emp);
		String msg="Record Inserted"+id+"is";
		model.addAttribute("msg", msg);
		return "home";
	}
	@RequestMapping("/show")
	public String showEmployee() {
		return "home";
	}
}

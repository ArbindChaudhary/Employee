package net.codejava.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model){
		List<Employee>listEmployee = service.listAll();
		model.addAttribute("listEmployee", listEmployee);
	return "index";
	
		

}
}

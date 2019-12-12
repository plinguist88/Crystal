package Controller.Cafeteria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.DTO.SupplyCompanyDTO;
import Service.Cafeteria.SupplyCompanyService;

@Controller
public class SupplyCompanyListController {
	@Autowired
	SupplyCompanyService supplyCompanyService;
	
	@RequestMapping("/cafeteria/supplyCompanyList")
	public String supplyCompanyList(Model model) {
		
		System.out.println("SupplyCompanyListController Go");
		
		return supplyCompanyService.supplyCompanyList(model);
	}
}

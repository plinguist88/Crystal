package Service.Cafeteria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.SupplyCompanyDTO;
import Repository.Cafeteria.SupplyCompanyRepository;

@Service
public class SupplyCompanyService {
	
	@Autowired
	SupplyCompanyRepository supplyCompanyRepository;
	
	public String supplyCompanyList(Model model) {
		
		System.out.println("SupplyCompanyListService Go");
		
		List<SupplyCompanyDTO> supplyCompanyList = supplyCompanyRepository.supplyCompanyList();
		
		model.addAttribute("supplyCompanyList", supplyCompanyList);
		System.out.println("supplyCompanyList Service : " + supplyCompanyList.size());
		
		return "cafeteria/supplyCompanyList";
	}
}

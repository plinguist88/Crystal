package Controller.Contractor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Service.Contractor.MyContractAllService;

@Controller
public class ContractorAsUserController {
	@Autowired
	MyContractAllService myContractAllService;
 
	@RequestMapping(value="/myContract/{id}", method = RequestMethod.GET)
	public String goMyContract(@PathVariable("id") String contractorId, Model model) {
		System.out.println("11contractorId:"+contractorId);
		myContractAllService.selectMyContracts(contractorId, model);
		
		return "contractor/myContracts";
	}
	
	@RequestMapping(value="/myBodyProfile/{id}", method = RequestMethod.GET)
	public String goMyBodyProfile(@PathVariable("id") String contractorId, Model model) {
		System.out.println("11contractorId:"+contractorId);
		myContractAllService.selectMyContracts(contractorId, model);
		
		return "contractor/myContracts";
	}	
	
	
	
}

package Controller.Contractor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.RegContractorCommand;
import Service.Contractor.RegContractorService;

@Controller
public class ContractorController {
	@Autowired
	RegContractorService regContractorService;
	
	//계약하기 페이지로 가기
	@RequestMapping(value="/initialContracts", method = RequestMethod.GET )
	public String goContracts(RegContractorCommand regContractorCommand) {
		
		return "contractor/contractor_register"; 
	}
	
	//계약자 계정 생성
	@RequestMapping(value="/registerContractor", method = RequestMethod.POST )
	public String registerContracts(RegContractorCommand regContractorCommand) {
		
		regContractorService.insertContractor(regContractorCommand);
		
		
		return "contractor/contractor_register"; 
	}	
}

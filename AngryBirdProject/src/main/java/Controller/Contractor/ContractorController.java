package Controller.Contractor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.RegContractorCommand;
import Service.Contractor.RegContractorService;
import Service.Contractor.SelectContractorOne;
import Service.Contractor.SelectContractorService;

@Controller
public class ContractorController {
	@Autowired
	RegContractorService regContractorService;
	@Autowired
	SelectContractorService selectContractorService;
	@Autowired
	SelectContractorOne selectContractorOne;
	
	//계약하기 페이지로 가기
	@RequestMapping(value="/contractors", method = RequestMethod.GET )
	public String goContracts(Model model) {
		selectContractorService.selectAllCandidates(model);
		return "contractor/contractor_list"; 
	}
	
	
	//계약자 등록 페이지로 가기
	@RequestMapping(value="/registerGoForCont", method = RequestMethod.GET )
	public String goContractsPage(RegContractorCommand regContractorCommand) {
		
		return "contractor/contractor_register"; 
	}
	
	//계약자 상세보기 페이지
	@RequestMapping(value="/contractorDetail/{id}", method = RequestMethod.GET )
	public String contractorDetail(@PathVariable("id") String contractorId, Model model) {
		selectContractorOne.selectOneContractor(contractorId, model);
		return "contractor/contractor_detail"; 
	}
	
	//계약자 계정 생성 
	@RequestMapping(value="/registerContractor", method = RequestMethod.POST )
	public String registerContracts(RegContractorCommand regContractorCommand) {
		
		regContractorService.insertContractor(regContractorCommand);
				
		return "redirect:contractors"; 
	}	
	
	

	
	
}

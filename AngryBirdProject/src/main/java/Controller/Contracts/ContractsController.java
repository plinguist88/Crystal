package Controller.Contracts;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.ContractCommand;
import Service.ContractSave.ContractSaveService;
import Service.Contracts.ContractGoService;
import Service.Contracts.ContractOneService;
import Service.Contracts.ContractSelectAllService;

@Controller
public class ContractsController {
	@Autowired
	ContractGoService contractGoService;
	@Autowired
	ContractSaveService contractSaveService;
	@Autowired
	ContractSelectAllService contractSelectAllService;
	@Autowired
	ContractOneService contractOneService;

	//계약서 등록 페이지로 가기 (계약서에 계약자 id도 출력되도록 하기)
	@RequestMapping(value="/contractGo/{id}", method = RequestMethod.GET)
	public String contractGo(@PathVariable("id") String contractorId, HttpSession session ,ContractCommand contractCommand, Model model) {
		
		contractGoService.showContractorEmployee(contractorId, session, model);		
		return "contracts/contract_upload";		
	}
	
	//서명 페이지 팝업창 열기
	@RequestMapping(value="/signatureSheet", method = RequestMethod.GET)
	public String signatureGo(ContractCommand contractCommand) {
	
		return "contracts/signaturePage";		
	}	
	
	//계약서 내용 및 서명 DB에 저장
	@RequestMapping(value="/contractUpload", method = RequestMethod.POST)
	public String contractUpload(ContractCommand contractCommand, HttpSession session) {
		
		contractSaveService.contractUpload(contractCommand, session);
		return "redirect:contractors";		
	}		
	
	//계약서 리스트 페이지
	@RequestMapping(value="/initialContracts", method = RequestMethod.GET)
	public String contractList(Model model) {
		
		contractSelectAllService.selectAll(model);
		return "contracts/contract_list";		
	}	
	
	//계약서 상세보기 페이지
	@RequestMapping(value="/contractDetail/{id}", method = RequestMethod.GET)
	public String contractDetail(@PathVariable("id") String contractNum, Model model) {
		
		contractOneService.selectContract(contractNum, model);		
		return "contracts/contract_detail";		
	}
	
}

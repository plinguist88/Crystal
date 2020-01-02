package Controller.Contractor;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.BodyProfileCommand;
import Model.DTO.ContractorInfo;
import Service.Contractor.MyBodyProfileGoService;
import Service.Contractor.MyBodyProfileUploadService;
import Service.Contractor.MyContractAllService;
import Service.Contractor.MyProfilSelectOneService;
import Service.Contractor.MyProfileAllService;

@Controller
public class ContractorAsUserController {
	@Autowired
	MyContractAllService myContractAllService;
	@Autowired
	MyProfileAllService myProfileAllService;
	@Autowired
	MyProfilSelectOneService myProfilSelectOneService;
	@Autowired
	MyBodyProfileGoService myBodyProfileGoService;
	@Autowired
	MyBodyProfileUploadService myBodyProfileUploadService; 
 
	//내 계약서 리스트 보러가기
	@RequestMapping(value="/myContract/{id}", method = RequestMethod.GET)
	public String goMyContract(@PathVariable("id") String contractorId, Model model) {
		System.out.println("11contractorId:"+contractorId);
		myContractAllService.selectMyContracts(contractorId, model);
		
		return "contractor/myContracts";
	}
	
	//내 바디프로필 리스트 보러가기
	@RequestMapping(value="/myBodyProfile/{id}", method = RequestMethod.GET)
	public String goMyBodyProfile(@PathVariable("id") String contractorId, Model model) {
		System.out.println("11contractorId:"+contractorId);
		myProfileAllService.selectMyProfiles(contractorId, model);
		
		return "contractor/myBodyProfiles";
	}	
	
	//바디프로필 등록 페이지로 가기
	@RequestMapping(value="/goBodyProfile", method = RequestMethod.GET)
	public String goBodyProfileUpload(BodyProfileCommand bodyProfileCommand, HttpSession session, Model model) {
		
		myBodyProfileGoService.contractorAndStandard(session, model);
		return "contractor/bodyProfile_upload";
	}		
	
	//바디프로필 등록하기
	@RequestMapping(value="/bodyProfileUpload", method = RequestMethod.POST)
	public String uploadBodyProfile(BodyProfileCommand bodyProfileCommand, HttpSession session) {
		
		ContractorInfo contractorInfo = (ContractorInfo) session.getAttribute("contractorInfo");
		myBodyProfileUploadService.uploadBodyProfile(bodyProfileCommand);
		return "redirect:myBodyProfile/"+ contractorInfo.getContractorId() ;
	}	
	
	//바디프로필에서 팝업창 띄우기
	@RequestMapping(value="/calculateStandards", method = RequestMethod.GET)
	public String popupForProfile() {
		
		return "contractor/calculateStandards";
	}	
	

	
	
}

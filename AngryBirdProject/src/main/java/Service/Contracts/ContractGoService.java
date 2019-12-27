package Service.Contracts;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ContractorDTO;
import Model.DTO.EmployeeInfo;
import Repository.Contractor.ContractorRepository;

@Service
public class ContractGoService {
	@Autowired
	ContractorRepository contractorRepository;

	public void showContractorEmployee(String contractorId, HttpSession session, Model model) {
		// TODO Auto-generated method stub
		
		//계약자 id, 계약자 이름 불러오기
		ContractorDTO conDTO = contractorRepository.selectOneContractor(contractorId);
		
		//직원 id 
		EmployeeInfo empInfo = (EmployeeInfo) session.getAttribute("employeeInfo");
		
		model.addAttribute("conDTO", conDTO);
		model.addAttribute("empInfo", empInfo);
		
	}

}

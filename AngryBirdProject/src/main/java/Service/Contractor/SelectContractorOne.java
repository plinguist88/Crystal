package Service.Contractor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ContractorDTO;
import Repository.Contractor.ContractorRepository;

@Service
public class SelectContractorOne {
	@Autowired
	ContractorRepository contractorRepository;
	
	public void selectOneContractor(String contractorId, Model model) {
		// TODO Auto-generated method stub
		ContractorDTO conDTO = contractorRepository.selectOneContractor(contractorId);
		
		model.addAttribute("conDTO", conDTO);
	}

}

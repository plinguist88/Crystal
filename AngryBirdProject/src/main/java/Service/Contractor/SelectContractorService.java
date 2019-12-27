package Service.Contractor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ContractorDTO;
import Repository.Contractor.ContractorRepository;

@Service
public class SelectContractorService {
	@Autowired
	ContractorRepository contractorRepository;

	public void selectAllCandidates(Model model) {
		
		List<ContractorDTO> conDTOs = contractorRepository.selectContractors();
		
		model.addAttribute("conDTOs", conDTOs);
	}

}

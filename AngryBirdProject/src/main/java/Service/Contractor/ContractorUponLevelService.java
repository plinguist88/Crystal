package Service.Contractor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ContractorDTO;
import Model.DTO.TrainingDTO;
import Repository.Contractor.ContractorRepository;

@Service
public class ContractorUponLevelService {
	@Autowired
	ContractorRepository contractorRepository;

	public void selectContractsUponLevel(String trainingLevel, Model model) {
		// TODO Auto-generated method stub
		
		List<ContractorDTO> list = contractorRepository.selectContractorUponLevel(trainingLevel);
		
		model.addAttribute("conList", list);
	}
	
	
}

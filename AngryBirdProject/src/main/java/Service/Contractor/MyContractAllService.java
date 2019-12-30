package Service.Contractor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ContractsDTO;
import Repository.Contractor.ContractorRepository;

@Service
public class MyContractAllService {
	@Autowired
	ContractorRepository contractorRepository;

	public void selectMyContracts(String contractorId, Model model) {
		// TODO Auto-generated method stub
		List<ContractsDTO> contractList = contractorRepository.selectAllMyContracts(contractorId);
		model.addAttribute("contractList", contractList);
	}

}

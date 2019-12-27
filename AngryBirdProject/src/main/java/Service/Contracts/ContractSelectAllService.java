package Service.Contracts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ContractsDTO;
import Repository.Contracts.ContractsRepository;

@Service
public class ContractSelectAllService {
	@Autowired
	ContractsRepository contractsRepository;

	public void selectAll(Model model) {
		// TODO Auto-generated method stub
		List<ContractsDTO> list = contractsRepository.selectAllContracts();
		model.addAttribute("ctDTOs", list);
		
	}
	
	
}

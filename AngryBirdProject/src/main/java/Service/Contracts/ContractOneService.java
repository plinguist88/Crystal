package Service.Contracts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ContractsDTO;
import Repository.Contracts.ContractsRepository;

@Service
public class ContractOneService {
	@Autowired
	ContractsRepository contractsRepository;

	public void selectContract(String contractNum, Model model) {
		// TODO Auto-generated method stub
		
		ContractsDTO ctDTO = contractsRepository.selectOneContract(contractNum);
		
		model.addAttribute("ctDTO", ctDTO);

	}

}

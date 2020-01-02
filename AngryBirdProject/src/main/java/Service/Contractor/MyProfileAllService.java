package Service.Contractor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.BodyProfileDTO;
import Repository.Contractor.ContractorRepository;

@Service
public class MyProfileAllService {
	@Autowired
	ContractorRepository contractorRepository;

	public void selectMyProfiles(String contractorId, Model model) {
		// TODO Auto-generated method stub
		List<BodyProfileDTO> list = contractorRepository.selectAllMyProfiles(contractorId);
		
		model.addAttribute("profileList", list);
	}

}

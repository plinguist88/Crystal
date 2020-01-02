package Service.Contractor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.BodyProfileCommand;
import Model.DTO.BodyProfileDTO;
import Repository.Contractor.ContractorRepository;

@Service
public class MyBodyProfileUploadService {
	@Autowired
	ContractorRepository contractorRepository; 

	public void uploadBodyProfile(BodyProfileCommand bodyProfileCommand) {
		// TODO Auto-generated method stub
		BodyProfileDTO bDTO = new BodyProfileDTO();
		bDTO.setContractorId(bodyProfileCommand.getContractorId());
		bDTO.setHeight(bodyProfileCommand.getHeight());
		bDTO.setWeight(bodyProfileCommand.getWeight());
		bDTO.setMeasureDate(bodyProfileCommand.getMeasureDate());
		bDTO.setGender(bodyProfileCommand.getGender());
		bDTO.setMetabolism(bodyProfileCommand.getMetabolism());
		
		contractorRepository.registerBodyProfile(bDTO);
	}

}

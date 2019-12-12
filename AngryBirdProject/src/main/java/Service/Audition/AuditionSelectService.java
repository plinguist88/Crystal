package Service.Audition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.AuditionDTO;
import Repository.Audition.AuditionRepository;

@Service
public class AuditionSelectService {
	@Autowired
	AuditionRepository auditionRepository;
	
	public void selectAuditionAll(Model model){
		List<AuditionDTO> auditions = auditionRepository.auditionSelectAll();
		model.addAttribute("auditions", auditions);
	}
}

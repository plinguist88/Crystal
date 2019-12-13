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
	
	//오디션 공고 - 전체 오디션 보기
	public void selectAuditionAll(Model model){
		List<AuditionDTO> auditions = auditionRepository.auditionSelectAll();
		model.addAttribute("auditions", auditions);
	}
	
	//오디션 공고 - 진행중인 오디션만 보기
	public void selectAuditionForGD(Model model){
		List<AuditionDTO> ongoingAuds = auditionRepository.auditionSelectForGD();
		model.addAttribute("ongoingAuds", ongoingAuds);
	}
}

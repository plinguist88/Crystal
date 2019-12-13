package Service.Audition;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.AuditionDTO;
import Model.DTO.EmployeeInfo;
import Repository.Audition.AuditionRepository;

@Service
public class AudSelectOneService {
	@Autowired
	AuditionRepository auditionRepository;

	public void selectOne(Integer auditionSeq, HttpSession session, Model model) {
		AuditionDTO oneAud= auditionRepository.auditionSelectOne(auditionSeq);
		
		model.addAttribute("oneAud", oneAud);
		
		EmployeeInfo employeeInfo = (EmployeeInfo) session.getAttribute("employeeInfo");
		model.addAttribute("employeeInfo", employeeInfo);
	}
}

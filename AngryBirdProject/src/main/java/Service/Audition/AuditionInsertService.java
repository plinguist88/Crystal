package Service.Audition;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.AuditionCommand;
import Model.DTO.AuditionDTO;
import Model.DTO.EmployeeInfo;
import Repository.Audition.AuditionRepository;

@Service
public class AuditionInsertService {
	@Autowired
	AuditionRepository auditionRepository;
	
	public Integer regAudition(AuditionCommand auditionCommand, HttpSession session) {
		AuditionDTO aud = new AuditionDTO();
		aud.setTitle(auditionCommand.getAuditionTitle());
		aud.setAuditionNo(Integer.parseInt(auditionCommand.getAuditionNum()));
		aud.setStartDate(auditionCommand.getStartDate());
		aud.setEndDate(auditionCommand.getEndDate());
		aud.setGather(auditionCommand.getAuditionGather());
		aud.setPassed(auditionCommand.getAuditionPassed());
		aud.setType(auditionCommand.getAuditionType());
		aud.setContent(auditionCommand.getAuditionContent());
		//session에서 employeeNum을 넣기로
		EmployeeInfo emp = (EmployeeInfo) session.getAttribute("employeeInfo");
		aud.setEmployeeNum(emp.getId());
		return auditionRepository.auditionInsert(aud); 
	}
}

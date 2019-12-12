package Service.Audition;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.AuditionCommand;
import Model.DTO.AuditionDTO;
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
		aud.setGather(Integer.parseInt(auditionCommand.getAuditionGather()));
		//합격인원은 나중에 update로 변경하기
		aud.setPassed(0);
		aud.setType(auditionCommand.getAuditionType());
		aud.setContent(auditionCommand.getAuditionContent());
		//session에서 employeeNum을 넣기로
		aud.setEmployeeNum("일단 session대신 id로..");
		return auditionRepository.auditionInsert(aud); 
	}
}

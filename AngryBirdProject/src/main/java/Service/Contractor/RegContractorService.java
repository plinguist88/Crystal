package Service.Contractor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.RegContractorCommand;
import Model.DTO.ContractorDTO;
import Repository.Contractor.ContractorRepository;

@Service
public class RegContractorService {
	@Autowired
	ContractorRepository contractorRepository;

	public void insertContractor(RegContractorCommand regContractorCommand, Model model) {
		// TODO Auto-generated method stub
		ContractorDTO conDTO = new ContractorDTO();
	
		
		//시간형태 yyyyMMdd로 만들기
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
		//오늘날짜 구하기
		Date date = new Date();
		String today = formatter.format(date.getTime()) ;
		
		conDTO.setContractorId("C"+ today);
		conDTO.setContractorPw(conDTO.getContractorId());
		conDTO.setContractorName(regContractorCommand.getContractorName());
		conDTO.setContractorBirth(regContractorCommand.getContractorBirth());
		conDTO.setContractorPhone(regContractorCommand.getContractorPhone());
		conDTO.setContractorAddr(regContractorCommand.getContractorAddr());
		conDTO.setContractorGender(regContractorCommand.getContractorGender());
		conDTO.setParticipantNum(regContractorCommand.getParticipantNum());
		conDTO.setContractorLevel(regContractorCommand.getContractorLevel());
		
		ContractorDTO conDTOforDetail =  contractorRepository.saveContractor(conDTO);
		model.addAttribute("conDTO", conDTOforDetail);
	}

}

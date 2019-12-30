package Service.Contractor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.RegContractorCommand;
import Encrypt.Encrypt;
import Model.DTO.ContractorDTO;
import Repository.Contractor.ContractorRepository;

@Service
public class RegContractorService {
	@Autowired
	ContractorRepository contractorRepository;

	public void insertContractor(RegContractorCommand regContractorCommand) {
		// TODO Auto-generated method stub
		ContractorDTO conDTO = new ContractorDTO();
	
		
		//시간형태 yyyyMMdd로 만들기
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
		//오늘날짜 구하기
		Date date = new Date();
		String today = formatter.format(date.getTime()) ;
		
		conDTO.setContractorName(regContractorCommand.getContractorName());
		conDTO.setContractorBirth(regContractorCommand.getContractorBirth());
		//ID 조합
		conDTO.setContractorId("C"+ today + "B" + conDTO.getContractorBirth()); /*substring에서는 뒤의 인덱스는 포함하지 않으므로 두개 갖고 싶으면 끝나는 인덱스를 2로*/
		
		//초기 PW는 ID와 동일 + 비밀번호 암호화
		conDTO.setContractorPw(Encrypt.getEncryption(conDTO.getContractorId()));
		
		System.out.println("::"+conDTO.getContractorId());
		System.out.println("::"+conDTO.getContractorPw());
		conDTO.setContractorPhone(regContractorCommand.getContractorPhone());
		conDTO.setContractorAddr(regContractorCommand.getContractorAddr());
		conDTO.setContractorGender(regContractorCommand.getContractorGender());
		conDTO.setParticipantNum(regContractorCommand.getParticipantNum());
		conDTO.setContractorLevel(regContractorCommand.getContractorLevel());
		
		contractorRepository.saveContractor(conDTO);
	}

}

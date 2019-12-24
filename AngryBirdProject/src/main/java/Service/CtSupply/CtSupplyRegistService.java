package Service.CtSupply;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.CtSupplyRegistCommand;
import Model.DTO.CtSupplyDTO;
import Repository.CtSupply.CtSupplyRegistRepository;

@Service
public class CtSupplyRegistService {
	@Autowired
	CtSupplyRegistRepository ctSupplyRegistRepository;
	public Integer ctSupplyRegist(CtSupplyRegistCommand ctSupplyRegistCommand) {
		
		CtSupplyDTO ctSupplyDTO = new CtSupplyDTO();
		
		SimpleDateFormat formatDate = new SimpleDateFormat("yyMMdd");
		SimpleDateFormat formatTime = new SimpleDateFormat("HHmmss");
		
		Date time1 = new Date();
		Date time2 = new Date();
		
		String nowDate = (String) formatDate.format(time1);
		String nowTime = (String) formatTime.format(time2);
				
		ctSupplyDTO.setScNo("SC"+nowDate+nowTime);
		
		ctSupplyDTO.setScLicense(ctSupplyRegistCommand.getScLicense());
		ctSupplyDTO.setScName1(ctSupplyRegistCommand.getScName1());
		ctSupplyDTO.setScName2(ctSupplyRegistCommand.getScName2());
		ctSupplyDTO.setScSort(ctSupplyRegistCommand.getScSort());
		ctSupplyDTO.setScAddr(ctSupplyRegistCommand.getScAddr());
		ctSupplyDTO.setScPh(ctSupplyRegistCommand.getScPh());
		
		Integer result = ctSupplyRegistRepository.getCtSupplyRegist(ctSupplyDTO);
	
		
		return result;
	}
}

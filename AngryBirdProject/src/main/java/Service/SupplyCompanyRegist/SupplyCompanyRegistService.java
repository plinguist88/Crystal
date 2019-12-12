package Service.SupplyCompanyRegist;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import Command.SupplyCompanyRegistCommand;
import Model.DTO.SupplyCompanyDTO;

@Service
public class SupplyCompanyRegistService {
	public Integer join(SupplyCompanyRegistCommand supplyCompanyRegistCommand) {
		
		SupplyCompanyDTO scDTO = new SupplyCompanyDTO();
		
		SimpleDateFormat formatDate = new SimpleDateFormat("yyMMdd");
		SimpleDateFormat formatTime = new SimpleDateFormat("HHmmss");
		
		Date time1 = new Date();
		Date time2 = new Date();
		
		String nowDate = (String) formatDate.format(time1);
		String nowTime = (String) formatTime.format(time2);
				
		scDTO.setScNo("SC"+nowDate+nowTime);
		
		scDTO.setScLicense(supplyCompanyRegistCommand.getScLicense());
		scDTO.setScName1(supplyCompanyRegistCommand.getScName1());
		scDTO.setScName2(supplyCompanyRegistCommand.getScName2());
		scDTO.setScSort(supplyCompanyRegistCommand.getScSort());
		scDTO.setScAddr(supplyCompanyRegistCommand.getScAddr());
		scDTO.setScPh(supplyCompanyRegistCommand.getScPh());
	
		
		return null;
	}
}

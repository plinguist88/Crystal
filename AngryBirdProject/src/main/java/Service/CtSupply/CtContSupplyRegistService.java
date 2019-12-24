package Service.CtSupply;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.CtContSupplyRegistCommand;
import Model.DTO.CtContSupplyDTO;
import Model.DTO.EmployeeInfo;
import Repository.CtSupply.CtContSupplyRegistRepository;

@Service
public class CtContSupplyRegistService {
	@Autowired
	CtContSupplyRegistRepository ctContSupplyRegistRepository;
	public Integer ctContSupplyRegist(CtContSupplyRegistCommand ctContSupplyRegistCommand, HttpSession session) {
		System.out.println("ctContSupplyRegist...");
		CtContSupplyDTO ctContSupplyDTO = new CtContSupplyDTO();
		
		SimpleDateFormat formatDate = new SimpleDateFormat("yyMMdd");
		SimpleDateFormat formatTime = new SimpleDateFormat("HHmmss");
		
		Date time1 = new Date();
		Date time2 = new Date();
		
		String nowDate = (String) formatDate.format(time1);
		String nowTime = (String) formatTime.format(time2);
				
		ctContSupplyDTO.setCcNo("CC"+nowDate+nowTime);
		
		ctContSupplyDTO.setCcDay(ctContSupplyRegistCommand.getCcDay());
		ctContSupplyDTO.setCcPeriod(ctContSupplyRegistCommand.getCcPeriod());
		ctContSupplyDTO.setCcExtention(ctContSupplyRegistCommand.getCcExtention());
		
		ctContSupplyDTO.setScNo(ctContSupplyRegistCommand.getScNo());
		
		EmployeeInfo employeeInfo = (EmployeeInfo)session.getAttribute("employeeInfo");
		String employeeNum = employeeInfo.getId();
				
		ctContSupplyDTO.setEmployeeNum(employeeNum);
		System.out.println(ctContSupplyDTO.getEmployeeNum());
		
		Integer result = ctContSupplyRegistRepository.getCtContSupplyRegist(ctContSupplyDTO);
		
		return result;
	}
}

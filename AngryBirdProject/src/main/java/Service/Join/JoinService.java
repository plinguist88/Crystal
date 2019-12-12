package Service.Join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.JoinCommand;
import Encrypt.Encrypt;
import Model.DTO.EmployeeDTO;
import Repository.Employee.EmployeeRepository;

@Service
public class JoinService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Integer join (JoinCommand joinCommand) {
		
		Integer result = null;
		EmployeeDTO employeeDTO = new EmployeeDTO();
		try {
			employeeDTO.setEmployeeNum("E" + joinCommand.getDeptNum() + joinCommand.getEmployeeHiredate() );
			employeeDTO.setEmployeeName(joinCommand.getEmployeeName() );
			employeeDTO.setEmployeeEmail(joinCommand.getEmployeeEmail() );
			employeeDTO.setEmployeePw(Encrypt.getEncryption(joinCommand.getEmployeePw() ) );	// 암호화
			employeeDTO.setEmployeePh(joinCommand.getEmployeePh() );
			employeeDTO.setEmployeeHiredYrs(joinCommand.getEmployeeHiredYrs() );
			employeeDTO.setEmployeeHiredate(joinCommand.getEmployeeHiredate() );
			employeeDTO.setEmployeeGender(joinCommand.getEmployeeGender() );
			employeeDTO.setEmployeeBirth(joinCommand.getEmployeeBirth() );
			employeeDTO.setEmployeeHeight(joinCommand.getEmployeeHeight() );
			employeeDTO.setEmployeeWeight(joinCommand.getEmployeeWeight() );
			employeeDTO.setEmployeeActive(joinCommand.getEmployeeActive() );
			employeeDTO.setEmployeeKcal(joinCommand.getEmployeeKcal() );
			employeeDTO.setDeptNum(joinCommand.getDeptNum() );
			employeeDTO.setJopTypeNum(joinCommand.getJopTypeNum() );
			
			result = employeeRepository.joinEmployee(employeeDTO);
			/*
			 * SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd"); Date date =
			 * dateFormat.parse(memberCommand.getUserBirth() ); Timestamp userBirth = new
			 * Timestamp(date.getTime() ); member.setUserBirth(userBirth);
			 */
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}

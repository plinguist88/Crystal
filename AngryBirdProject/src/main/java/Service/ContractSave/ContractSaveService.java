package Service.ContractSave;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.ContractCommand;
import Model.DTO.ContractsDTO;
import Model.DTO.EmployeeInfo;
import Repository.Contracts.ContractsRepository;

@Service
public class ContractSaveService {
	@Autowired
	ContractsRepository contractsRepository;

	public void contractUpload(ContractCommand contractCommand, HttpSession session) {
		// TODO Auto-generated method stub
		
		ContractsDTO ctDTO = new ContractsDTO();

		ctDTO.setContractorId(contractCommand.getContractorId());
		//등록일자 구하기
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String regDate = sdf.format(date.getTime());
		
		ctDTO.setContractNum(ctDTO.getContractorId() +"_" + regDate);
		ctDTO.setContractType(contractCommand.getContractType());
		ctDTO.setContractStartDate(contractCommand.getContractStartDate());
		ctDTO.setContractEndDate(contractCommand.getContractEndDate());
		ctDTO.setSignature(contractCommand.getSignature());
		ctDTO.setContractorName(contractCommand.getContractorName());
		
		EmployeeInfo empInfo = (EmployeeInfo) session.getAttribute("employeeInfo");		
		ctDTO.setEmployeeId(empInfo.getId());
		
		contractsRepository.saveContracts(ctDTO);
	}

}

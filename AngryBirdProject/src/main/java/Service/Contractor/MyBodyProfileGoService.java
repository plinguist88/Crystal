package Service.Contractor;

import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ContractorDTO;
import Model.DTO.ContractorInfo;
import Repository.Contractor.ContractorRepository;

@Service
public class MyBodyProfileGoService {
	@Autowired
	ContractorRepository contractorRepository;

	public void contractorAndStandard(HttpSession session, Model model) {
		// TODO Auto-generated method stub
		
		ContractorInfo contractorInfo = (ContractorInfo) session.getAttribute("contractorInfo");
		String contractorId = contractorInfo.getContractorId();
		
		ContractorDTO conDTO = contractorRepository.selectOneContractor(contractorId);
		
		//계약자의 만 나이 구하기
		String birth = conDTO.getContractorBirth();
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String currentDate = formatter.format(date);
		
		//today
		int currentYear = Integer.parseInt( currentDate.substring(0, 4) );
		int currentMonth = Integer.parseInt( currentDate.substring(4, 6) );
		int currentDay = Integer.parseInt( currentDate.substring(6, 8) );

		int birthYear = Integer.parseInt( birth.substring(0, 4) );
		int birthMonth = Integer.parseInt( birth.substring(4, 6) );
		int birthDay = Integer.parseInt( birth.substring(6, 8) );

		//만나이
		int age = currentYear - birthYear;
		if(currentMonth<birthMonth) {    //생일달이 아직 안지난 경우
			age -= 1;
		}
		else if(currentMonth==birthMonth) {//생일달이지만 생일 안지난 경우
			if(currentDay<birthDay) {
				age -=1;
			}
		}
		//생일 지난 경우는 else에 해당하며 이 때는 그냥 currentYear - birthYear가 만나이임
		conDTO.setContractorBirth(String.valueOf(age));
		
		//List<MeasureDTO> measureDTO = contractorRepository.selectAllStandards();
		model.addAttribute("conDTO", conDTO);
	}

}

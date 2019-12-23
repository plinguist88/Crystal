package Service.CtSupply;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.CtSupplyDTO;
import Repository.CtSupply.CtSupplyDetailRepository;

@Service
public class CtSupplyDetailService {
	@Autowired
	CtSupplyDetailRepository ctSupplyDetailRepository;
	public String ctSupplyDetail(String scNo, HttpSession session, Model model) {
		
		System.out.println("ctSupplyDetailService...");
				
		System.out.println(scNo);
		
		CtSupplyDTO ctSupplyDTO = ctSupplyDetailRepository.getCtSupplyDetail(scNo);
		
		System.out.println(ctSupplyDTO.getScNo());
		
		model.addAttribute("ctSupplyDTO", ctSupplyDTO);
		
		System.out.println(ctSupplyDTO.getScNo());
		
		System.out.println("ctSupplyDetailService Complite!");
		
		return "ctSupply/ctSupplyDetail";
	}
}

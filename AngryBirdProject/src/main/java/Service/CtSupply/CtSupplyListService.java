package Service.CtSupply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.CtSupplyDTO;
import Repository.CtSupply.CtSupplyListRepository;

@Service
public class CtSupplyListService {
	
	@Autowired
	CtSupplyListRepository ctSupplyListRepository;
	
	public String ctSupplyList(Model model) {
		
		System.out.println("ctSupplyListService...");
		
		List<CtSupplyDTO> ctSupplyDTO = ctSupplyListRepository.getCtSupplyList();
		
		model.addAttribute("ctSupplyDTO", ctSupplyDTO);
		System.out.println("ctSupplyDTO`size..." + ctSupplyDTO.size());
		
		return "ctSupply/ctSupplyList";
	}
}

package Service.CtSupply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.CtContSupplyDTO;
import Repository.CtSupply.CtContSupplyListRepository;

@Service
public class CtContSupplyListService {
	
	@Autowired
	CtContSupplyListRepository ctContSupplyRepository;
	public String ctSupplyList(Model model) {
		
		List<CtContSupplyDTO> ctContSupplyDTO = ctContSupplyRepository.getCtContSupplyList();
		
		System.out.println("ctContSupplyDTO`size :" + ctContSupplyDTO.size());
		
		model.addAttribute("ctContSupplyDTO", ctContSupplyDTO);
		
		return "ctSupply/ctContSupplyList";
		
	}
}

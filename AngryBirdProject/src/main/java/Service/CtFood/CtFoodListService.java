package Service.CtFood;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.CtFoodDTO;
import Repository.CtFood.CtFoodListRepository;

@Service
public class CtFoodListService {
	@Autowired
	CtFoodListRepository ctFoodListRepository;
	public String ctFoodList(Model model) {
		
		List<CtFoodDTO> ctFoodDTO = ctFoodListRepository.getCtFoodList();
		System.out.println(ctFoodDTO.size());
		model.addAttribute("ctFoodDTO", ctFoodDTO);
		
		return "ctFood/ctFoodList";
	}
}

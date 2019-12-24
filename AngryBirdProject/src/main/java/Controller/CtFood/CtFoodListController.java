package Controller.CtFood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Service.CtFood.CtFoodListService;

@Controller
public class CtFoodListController {
	@Autowired
	CtFoodListService ctFoodListService;
	@RequestMapping(value="/ctFoodList", method=RequestMethod.GET)
	public String ctFoodList(Model model) {
		return ctFoodListService.ctFoodList(model);
	}	
}

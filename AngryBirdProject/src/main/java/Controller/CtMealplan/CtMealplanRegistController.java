package Controller.CtMealplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CtMealplanRegistController {
	@Autowired
	//CtMealplanRegistService ctMealplanRegistService;
	@RequestMapping("/ctMealplanRegist")
	public String ctMealplanRegist() {
		return null;//ctMealplanRegistService.ctMealplanRegist;
	}
}

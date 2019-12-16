package Controller.CtSupply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.CtSupply.CtSupplyListService;

@Controller
public class CtSupplyListController {
	@Autowired
	CtSupplyListService ctSupplyListService;
	@RequestMapping("/ctSupplyList")
	public String ctSupplyList(Model model) {
		System.out.println("ctSupplyList...");
		return ctSupplyListService.ctSupplyList(model);
	}
}

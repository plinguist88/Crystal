package Controller.CtSupply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.CtSupply.CtContSupplyListService;

@Controller
public class CtContSupplyListController {
	@Autowired
	CtContSupplyListService ctContSupplyListService;
	@RequestMapping("/ctContSupplyList")
	public String CtContSupplyList(Model model) {
		System.out.println("ctContSupplyList...");
		return ctContSupplyListService.ctSupplyList(model);
	}
}

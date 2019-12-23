package Controller.CtSupply;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Service.CtSupply.CtSupplyDetailService;

@Controller
public class CtSupplyDetailController {
	@Autowired
	CtSupplyDetailService ctSupplyDetailService;
	@RequestMapping("/ctSupplyDetail")
	public String ctSupplyDetail(@RequestParam("scNo") String scNo, HttpSession session, Model model) {
		System.out.println("ctSupplyDetail...");
		System.out.println(scNo);
		
		return ctSupplyDetailService.ctSupplyDetail(scNo, session, model);
	}
}

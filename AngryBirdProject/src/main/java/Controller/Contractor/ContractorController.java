package Controller.Contractor;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContractorController {
	@RequestMapping(value="/registerContractor", method = RequestMethod.GET )
	public String registerContractor(HttpSession session) {
		session.getAttribute("EmployeeInfo");

		return ""; 
	}
}

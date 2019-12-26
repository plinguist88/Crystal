package Controller.CtMain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CtCafeteriaController {
	@RequestMapping(value="/ctCafeteria", method=RequestMethod.GET)
	public String ctCafeteria() {
		return "ctMain/ctCafeteria";
	}
}

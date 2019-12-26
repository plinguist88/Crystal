package Controller.Pos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PosController {

	@RequestMapping(value = "/pos", method = RequestMethod.GET)
	public String pos () {
		
		return "store/pos1";
	}
	
}

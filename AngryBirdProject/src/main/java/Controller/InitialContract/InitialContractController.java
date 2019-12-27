package Controller.InitialContract;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InitialContractController {
	
	//계약서 등록하는 페이지로 가기
	@RequestMapping(value="/contractGo", method = RequestMethod.GET)
	public String goForInitial() {
		
		return "";
	}

}

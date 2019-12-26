package Controller.Pos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import Model.DTO.SalesDTO;
import Model.DTO.SalesRecordDTO;
import Service.Goods.PaymentService;

@Controller
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	@ResponseBody
	public String payment (@RequestBody Map<String, Object> map, HttpSession session, HttpServletRequest request) {//SalesDTO salesDTO, 
		System.out.println(map.get(1));
		//System.out.println(salesDTO.getItemsName());
		//System.out.println(salesDTO.getItemsCount());
		//System.out.println(salesDTO.getItemsPrice());
		
		return "store/pos1";
	}
}

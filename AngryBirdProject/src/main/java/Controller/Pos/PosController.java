package Controller.Pos;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.GoodsCommand;
import Service.Goods.GoodsService;

@Controller
public class PosController {

	@Autowired
	GoodsService goodsService;
	
	@RequestMapping(value = "/pos", method = RequestMethod.GET)
	public String pos (GoodsCommand goodsCommand, Model model, HttpSession session) {
		
		goodsService.goodsSelect(model, session);
		
		return "store/pos1";
	}
	
}

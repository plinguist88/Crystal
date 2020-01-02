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
public class GoodsController {

	@Autowired
	GoodsService goodsService;
	
	@RequestMapping(value = "/goodsList", method = RequestMethod.POST)
	public String goodsList (GoodsCommand goodsCommand, Model model, HttpSession session) {
		
		goodsService.goodsSelect(model, session);
		
		return "store/pos1";
	}
	
	@RequestMapping(value = "/insertGoods", method = RequestMethod.POST)
	public String insertGoods(GoodsCommand goodsCommand, HttpSession session) {
		
		goodsService.insertGoods(goodsCommand, session);
		
		return "store/goodsList";
	}
}

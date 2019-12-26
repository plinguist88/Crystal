package Service.Goods;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.GoodsCommand;
import Model.DTO.ItemsDTO;
import Repository.Goods.GoodsRepository;

@Service
public class GoodsService {

	@Autowired
	GoodsRepository goodsRepository;
	
	public void goodsSelect(Model model, HttpSession session) {
		//String itemlist = null;
		List<ItemsDTO> list = goodsRepository.goodsSelect();
		//model.addAttribute("goods", list);
		session.setAttribute("goods", list);
		System.out.println("list : " + list.size() );
		
	}
	
	public void insertGoods(GoodsCommand goodsCommand, HttpSession session) {
		
		ItemsDTO itemsDTO = new ItemsDTO();
		// ??????????????????? 나중에 설정
		try {
			itemsDTO.setItemsName(goodsCommand.getItemsName() );
			itemsDTO.setItemsName(goodsCommand.getItemsName() );
			itemsDTO.setItemsName(goodsCommand.getItemsName() );
			itemsDTO.setItemsName(goodsCommand.getItemsName() );
			itemsDTO.setItemsName(goodsCommand.getItemsName() );
			itemsDTO.setItemsName(goodsCommand.getItemsName() );
			itemsDTO.setItemsName(goodsCommand.getItemsName() );
			
			//itemsDTO.setItemsCount(itemsDTO);
			goodsRepository.insertGoods(itemsDTO);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
	}
	
}

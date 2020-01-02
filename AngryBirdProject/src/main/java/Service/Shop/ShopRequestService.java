package Service.Shop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.ShopRequestCommand;
import Model.DTO.ShopRequestDTO;
import Model.DTO.Shops2DTO;
import Repository.Shop.ShopRepository;

@Service
public class ShopRequestService {

	@Autowired
	ShopRepository shopRepository;

	public void shops2(Model model) {
		List<Shops2DTO> dto = shopRepository.shops2();
		if(dto != null) {
			model.addAttribute("shops2", dto);
		}
	}

	public void join(ShopRequestCommand shopRequestCommand) {
		ShopRequestDTO shd = new ShopRequestDTO();

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm");
		String today = sdf.format(date);

		shd.setShopRequestResvNum(shopRequestCommand.getEmployeeNum() + '-' + today);
		shd.setEmployeeNum(shopRequestCommand.getEmployeeNum());
		shd.setManagerCelebrity(shopRequestCommand.getManagerCelebrity());
		shd.setShopsName(shopRequestCommand.getShopsName());
		shd.setShopRequestStartTime(shopRequestCommand.getShopRequestStartTime());
		shd.setShopRequestEndTime(shopRequestCommand.getShopRequestEndTime());		
		
		shopRepository.insertShopRequest(shd);
	
	}
}
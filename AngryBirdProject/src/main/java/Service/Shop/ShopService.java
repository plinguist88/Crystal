package Service.Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.Shop.ShopRepository;

@Service
public class ShopService {
	
	@Autowired
	ShopRepository shopRepository;
	
	public void shopAction() {
		
	}
}

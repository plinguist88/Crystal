package Service.Shop;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.EmployeeInfo;
import Model.DTO.ManagerDTO;
import Repository.Shop.ShopRepository;

@Service
public class ShopRequestManagerService {
	
@Autowired
ShopRepository shopRepository;

	public void findManager(HttpSession httpSession, Model model) {
		ManagerDTO dto = new ManagerDTO();
		String employeeNum = ((EmployeeInfo)httpSession.getAttribute("employeeInfo")).getId();
		dto.setEmployeeNum(employeeNum);
		List<ManagerDTO> list = shopRepository.celebrityList(dto);
		for(ManagerDTO d : list) {
			System.out.println("ㅇㅇㅇㅇㅇ : : :" + d.getManagerCelebrity());
		}
		model.addAttribute("list", list);
	}
}

package Service.Goods;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.DTO.SalesDTO;
import Model.DTO.SalesRecordDTO;
import Repository.Goods.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository paymentRepository;
	
	public void payment(SalesDTO salesDTO, HttpSession session, HttpServletRequest request) {
		
		SalesRecordDTO recordDTO = new SalesRecordDTO();
		
		try {
			recordDTO.setItemsNo(salesDTO.getItemsNo().split(",") );
			recordDTO.setItemsName(salesDTO.getItemsName().split(",") );
		//	recordDTO.setItemsTransaction(Integer.parseInt(salesDTO.getItemsCount().split(",") ) );
		//	recordDTO.setItemsTotalPrice(Integer.parseInt(salesDTO.getItemsNo().split(",") ) );
			
			paymentRepository.payment(recordDTO);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
	}
}

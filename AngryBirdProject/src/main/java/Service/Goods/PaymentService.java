package Service.Goods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		List<SalesDTO> list = new ArrayList<SalesDTO>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		
		SalesRecordDTO recordDTO = new SalesRecordDTO();
		
		try {
	/*		recordDTO.setItemsNo(salesDTO.getItemsNo() );
			recordDTO.setItemsName(salesDTO.getItemsName() );
			recordDTO.setItemsTransaction(Integer.parseInt(salesDTO.getItemsCount() ) );
			recordDTO.setItemsTotalPrice(Integer.parseInt(salesDTO.getItemsNo() ) ); */
			
			paymentRepository.payment(recordDTO);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
	}
}

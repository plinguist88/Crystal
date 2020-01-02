package Service.Goods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Model.DTO.ItemsDTO;
import Model.DTO.SalesDTO;
import Model.DTO.SalesRecordDTO;
import Repository.Goods.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository paymentRepository;
	
	StringTokenizer tokenizer = null;
	List<SalesRecordDTO> salesRecordDTO = new ArrayList<SalesRecordDTO>();
	
	@Transactional
	public void payment(SalesDTO salesDTO, HttpSession session, HttpServletRequest request) {	// 결제 된 상품 정보
		//Map<String, Object> map = new HashMap<String, Object>();
		
		List<String> itemsNo = new ArrayList<String>();
		List<String> itemsName = new ArrayList<String>();
		List<String> itemsCount = new ArrayList<String>();
		List<String> itemsPrice = new ArrayList<String>();
		
		tokenizer = new StringTokenizer(salesDTO.getItemsNo(), "," );
		while (tokenizer.hasMoreElements()) {
			itemsNo.add(tokenizer.nextToken());
			
		}
		
		tokenizer = new StringTokenizer(salesDTO.getItemsName(), "," );
		while (tokenizer.hasMoreElements()) {
			itemsName.add(tokenizer.nextToken());
			
		}
		
		tokenizer = new StringTokenizer(salesDTO.getItemsCount(), "," );
		while (tokenizer.hasMoreElements()) {
			itemsCount.add(tokenizer.nextToken());
			
		}
		
		tokenizer = new StringTokenizer(salesDTO.getItemsPrice(), "," );
		while (tokenizer.hasMoreElements()) {
			itemsPrice.add(tokenizer.nextToken());
			
		}
		
		for (int i = 0; i < itemsNo.size(); i++) {
			SalesRecordDTO recordDTO = new SalesRecordDTO();
			recordDTO.setItemsNo(itemsNo.get(i) );
			recordDTO.setItemsName(itemsName.get(i) );
			recordDTO.setItemsTransaction(Integer.parseInt(itemsCount.get(i) ) );
			recordDTO.setItemsTotalPrice(Integer.parseInt(itemsPrice.get(i) ) );
			
			salesRecordDTO.add(recordDTO);
			// 테스트
			System.out.println(recordDTO.getItemsNo() );
			System.out.println(recordDTO.getItemsName() );
			System.out.println(recordDTO.getItemsTransaction() );
			System.out.println(recordDTO.getItemsTotalPrice() );
			
		}
		
		paymentRepository.payment(salesRecordDTO);
		
		paymentRepository.updatePay(salesRecordDTO);
		
		
		
	}
}

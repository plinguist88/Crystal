package Repository.Goods;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.SalesRecordDTO;

@Repository
public class PaymentRepository {

	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "Goods.";
	
	public void payment(List<SalesRecordDTO> list) {
		
		String stmt = namespace + "payment";
		
		for (SalesRecordDTO salesRecordDTO : list) {
			sqlSession.insert(stmt, salesRecordDTO);
			
		}
	}
	
	public void updatePay(List<SalesRecordDTO> sale) {
		
		String stmt = namespace + "updateCount";
		
		for (SalesRecordDTO salesRecordDTO : sale) {
			sqlSession.update(stmt, salesRecordDTO);
		}
		
	}
}

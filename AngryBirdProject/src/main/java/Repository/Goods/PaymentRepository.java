package Repository.Goods;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.SalesRecordDTO;

@Repository
public class PaymentRepository {

	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "Goods.";
	
	public void payment(SalesRecordDTO recordDTO) {
		
		String stmt = namespace + "payment";
		sqlSession.insert(stmt, recordDTO);
		
	}
}

package Repository.CtSupply;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.CtSupplyDTO;

@Repository
public class CtSupplyListRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "ctSupplyMapper";
	
	public List<CtSupplyDTO> getCtSupplyList() {
		
		System.out.println("ctSupplyListRepository...");
		
		String statement = namespace + ".ctSupplyList";
		
		return sqlSession.selectList(statement);
	}
}

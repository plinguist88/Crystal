package Repository.CtSupply;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.CtContSupplyDTO;
@Repository
public class CtContSupplyListRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "ctSupplyMapper";
	
	public List<CtContSupplyDTO> getCtContSupplyList() {
		
		String statement = namespace + ".ctContSupplyList";
		
		return sqlSession.selectList(statement);
		
	}
}

package Repository.CtFood;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.CtFoodDTO;

@Repository
public class CtFoodListRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "ctFoodMapper";
	
	public List<CtFoodDTO> getCtFoodList() {
		
		String statement = namespace + ".ctFoodList";
		
		return sqlSession.selectList(statement);
	}
}

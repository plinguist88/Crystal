package Repository.Cafeteria;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.SupplyCompanyDTO;

@Repository
public class SupplyCompanyRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "supplyCompanyMapper";
	
	public List<SupplyCompanyDTO> supplyCompanyList() {
		
		System.out.println("SupplyCompanyListRepository Go");
		
		String statement = namespace + ".supplyCompanyList";
		
		return sqlSession.selectList(statement);
	}
}

package Repository.Car;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.CarRequestDTO;
import Model.DTO.CarsDTO;

@Repository
public class CarRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String nameSpace = "CarMapper";
	
	public List<CarsDTO> cars() {
		
		String stmt = nameSpace + ".carSel";
		return sqlSession.selectList(stmt);
	}
}

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
	
	//요청페이지에 차종류를 불러오기 위한 SELECT 
	public List<CarsDTO> cars() {
		
		String stmt = nameSpace + ".carSel";
		return sqlSession.selectList(stmt);
	}

	//배차요청 INSERT
	public void insertCarRequest(CarRequestDTO dto) {
		// TODO Auto-generated method stub
		
		String statement = nameSpace + ".insertCarRequest" ;
		
		sqlSession.insert(statement, dto);
	}
	
	//carRequest selectAll
	public List<CarRequestDTO> carRequestListSelectAll(){
		String statement = nameSpace + ".selectCarRequestList";
		List<CarRequestDTO> carRequestLists = sqlSession.selectList(statement);
		return carRequestLists;
	}
}

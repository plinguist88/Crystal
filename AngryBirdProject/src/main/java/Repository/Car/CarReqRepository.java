package Repository.Car;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.CarRequestDTO;

@Repository
public class CarReqRepository {
	@Autowired 
	private SqlSession sqlSession;	
	private final String namespace= "CarMapper";
	
	public Integer insertCarReq(CarRequestDTO dto) {
		String statement = namespace + ".carReq";
		return sqlSession.insert(statement, dto);
	}
}

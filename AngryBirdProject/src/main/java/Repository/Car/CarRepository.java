package Repository.Car;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String nameSpace = "CarMapper";
	public void cars() {
		String stmt = nameSpace + ".carReq";
		sqlSession.select(stmt, null);
	}
}

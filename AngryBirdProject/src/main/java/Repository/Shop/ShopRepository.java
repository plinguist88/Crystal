package Repository.Shop;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ManagerDTO;
import Model.DTO.ShopRequestDTO;
import Model.DTO.Shops2DTO;

@Repository
public class ShopRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String nameSpace = "ShopMapper";
	
	//숍 예약 INSERT
	public void insertShopRequest(ShopRequestDTO dto) {
		String statement = nameSpace + ".insertShopRequest" ;
		sqlSession.insert(statement, dto);
	}
	
	//숍 예약페이지에 숍 이름 불러오기 위한 SELECT
	public List<Shops2DTO> shops2(){
		return null;
	}

	public List<ManagerDTO> celebrityList(ManagerDTO dto) {
		String statement = nameSpace + ".selectCelebrity";
		return sqlSession.selectList(statement, dto);
	}
	
}

package Repository.Shop;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShopRepository {

	@Autowired
	private SqlSession sqlSession;
	
	private final String nameSpace = "shop.";	//여기서만 이름 . 쓴다
	
	public void shopAction() {
		
		String pstmt = nameSpace + "shopAction";
		
		return ;
	}
}

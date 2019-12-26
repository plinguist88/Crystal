package Repository.Goods;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ItemsDTO;

@Repository
public class GoodsRepository {

	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "Goods.";
	
	public List<ItemsDTO> goodsSelect() {
		
		String stmt = namespace + "goodsList";
		List<ItemsDTO> list = sqlSession.selectList(stmt);
		
		return list;
	}
	
	public void insertGoods(ItemsDTO itemsDTO) {
		
		String stmt = namespace + "insertGoods";
		
	}
}

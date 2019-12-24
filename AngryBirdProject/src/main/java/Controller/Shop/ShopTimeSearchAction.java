package Controller.Shop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShopTimeSearchAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		Integer goodsNum = Integer.parseInt(request.getParameter("goodsNum"));
		
		request.setAttribute("goodsNum", goodsNum);
		java.sql.Date selectDate;
		
		if(request.getParameter("selectDate") != null) {
			System.out.println(goodsNum);
			
			
		}
		
		return null;
	}
	
}

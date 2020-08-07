package kr.co.jsp.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.jsp.board.model.BoardDAO;
import kr.co.jsp.board.model.BoardVO;

public class ModifyServiceImpl implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int bId=Integer.parseInt(request.getParameter("bId"));
		BoardVO vo =BoardDAO.getInstance().contentBoard(bId);
		
		request.setAttribute("modifyBoard", vo);
	}

}
package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.PageDao;
import DTO.Board;

@Service
public class PageService {
	@Autowired
	private PageDao dao;
	
	//���ۼ�
	public int insert(Board board) {
		return dao.insert(board);
	}
	
	//�� ���
	public ArrayList<Board> getBoardList(String id) {
		return dao.getBoardList(id);
	}
	
	// 마이페이지 상세글
	public Board board_conf(int no){
		return dao.board_conf(no);
	}
}

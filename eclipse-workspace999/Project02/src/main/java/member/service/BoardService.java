package member.service;


import java.util.HashMap;
import java.util.List;

import member.vo.BoardVO;

public interface BoardService {
	public void write(BoardVO board);
	public void modify(BoardVO board);
	public void remove(int num);
	public BoardVO getBoard(int num);
	public List<BoardVO> getBoardList();
	public List<BoardVO> getBoardSearchList(HashMap<String,Object> params);
}
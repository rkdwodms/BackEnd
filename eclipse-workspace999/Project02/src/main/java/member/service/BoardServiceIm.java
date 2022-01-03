package member.service;


import java.util.HashMap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import member.dao.BoardMapper;
import member.vo.BoardVO;

@Service
public class BoardServiceIm implements BoardService {
    
    @Autowired
    private BoardMapper bMapper;
 
    @Override
    public void write(BoardVO board) {
        // TODO Auto-generated method stub
        bMapper.insertBoard(board);
    }
 
    @Override
    public void modify(BoardVO board) {
        // TODO Auto-generated method stub
        bMapper.updateBoard(board);
    }
 
    @Override
    public void remove(int num) {
        // TODO Auto-generated method stub
        bMapper.deleteBoard(num);
    }
 
    @Override
    public BoardVO getBoard(int num) {
        // TODO Auto-generated method stub
        return bMapper.selectOneBoard(num);
    }
 
    @Override
    public List<BoardVO> getBoardList() {
        // TODO Auto-generated method stub
        return bMapper.selectAllBoard();
    }
 
    @Override
    public List<BoardVO> getBoardSearchList(HashMap<String, Object> params) {
        // TODO Auto-generated method stub
        return null;
    }
}
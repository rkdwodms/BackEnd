package member.dao;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.*;

import member.vo.BoardVO;

public interface BoardMapper {
public void insertBoard (BoardVO board);
    public void updateBoard (BoardVO board);
    public void deleteBoard (int num);
    public BoardVO selectOneBoard (int num);
    public List<BoardVO> selectSearchBoard (HashMap<String, Object> params);
    public List<BoardVO> selectAllBoard();
}

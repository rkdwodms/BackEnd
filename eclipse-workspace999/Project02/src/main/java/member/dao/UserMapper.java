package member.dao;


import java.util.List;

import org.apache.ibatis.annotations.*;

import member.vo.UserVO;

public interface UserMapper {
	public void insertUser (UserVO user);
	public void updateUser (UserVO user);
	public void deleteUser (String userId);
	public UserVO selectOneUser (String userId);
	public List<UserVO> selectAllUser();

}
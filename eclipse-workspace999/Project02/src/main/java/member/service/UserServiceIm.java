package member.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import member.dao.UserMapper;
import member.vo.UserVO;

@Service
public class UserServiceIm implements UserService {
	@Autowired
	private UserMapper uMapper;
	
	@Override
	public boolean login (String userId,String userPw) {
		UserVO user=uMapper.selectOneUser(userId); //id를통해 userDto가져와서 null이아니면 db에 존재하는 아이디 이겠죠?
		if(user!=null) {
			if(user.getUserPw().equals(userPw)) 
				return true;
		}
		return false;
	}
	
	@Override
	public boolean join (UserVO user)/*회원가입*/ {
		if(uMapper.selectOneUser(user.getUserId())==null)//아이디중복여부체크
		{
			uMapper.insertUser(user);
			return true;
		}
		else
			return false;
	}
	
	@Override
	public void modify(UserVO user) {
		uMapper.updateUser(user);
	}
	@Override
	public void withdraw(String userId)/*탈퇴*/ {
		uMapper.deleteUser(userId);
	}
	@Override
	public UserVO getUser(String userId) {
		return uMapper.selectOneUser(userId);
	}
	@Override
	public List<UserVO> getUserList(){
		return uMapper.selectAllUser();
	}
}
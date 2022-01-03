package member.service;


import java.util.List;
import member.vo.UserVO;

public interface UserService {
	public boolean login (String userId, String userPw);
	public boolean join (UserVO user);
	public void modify(UserVO user);
	public void withdraw(String userId);
	public UserVO getUser(String userId);
	public List<UserVO> getUserList();
}
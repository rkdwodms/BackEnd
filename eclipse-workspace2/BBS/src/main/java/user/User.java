package user;

public class User {

	private String userID;
	private String userPassword;
	private String userName;
	private String userPhone;
	private String userEmail;
	
	

	public User(String userID, String userPassword, String userName, String userPhone, String userEmail) {
		super();
		this.userID = userID;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
	}
	
	

	public User() {

	}



	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userPassword=" + userPassword + ", userName=" + userName + ", userPhone"
				+ userPhone + ", userEmail" + userEmail + "]";

	}
}

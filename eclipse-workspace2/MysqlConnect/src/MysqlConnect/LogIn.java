package MysqlConnect;

import java.sql.Connection;
import java.sql.Statement;

public class LogIn {
	 private String url = "jdbc:mysql://localhost:3306/db01";
	 private String id = "root";
	 private String pw = "1234";
	 
	public LogIn(String url, String id, String pw) {
		super();
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the pw
	 */
	public String getPw() {
		return pw;
	}
	/**
	 * @param pw the pw to set
	 */
	public void setPw(String pw) {
		this.pw = pw;
	}	
	 
}
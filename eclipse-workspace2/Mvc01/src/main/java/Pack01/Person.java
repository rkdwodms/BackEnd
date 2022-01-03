package Pack01;

public class Person{
	String id;
	int pass;
	
	public Person(String id, int pass) {
		super();
		this.id = id;
		this.pass = pass;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
}
package MysqlConnect;

public class DataSet {
	String tableName;
	String name;
	int Age;
	int Salary;
	
	public DataSet(String tableName) {
		super();
		this.tableName = tableName;
	}
	public DataSet(String tableName, String name, int age, int salary) {
		super();
		this.tableName = tableName;
		this.name = name;
		Age = age;
		Salary = salary;
	}
	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}
	/**
	 * @param tableName the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return Age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		Age = age;
	}
	/**
	 * @return the salary
	 */
	 public int getSalary() {
		   return Salary;
		  }
		  /**
		   * @param salary the salary to set
		   */
		  public void setSalary(int salary) {
		   Salary = salary;
		  }	  
		  
		 }
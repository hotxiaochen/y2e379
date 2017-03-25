package cn.springtest.entity;

/**
 * �û���
 * 
 * @author Yuan
 * 
 */
public class BookUser {
	/**
	 * �û�id
	 */
	private Integer Id;
	/**
	 * �û�����
	 */
	private String Name;
	/**
	 * ����
	 */
	private String Password;
	/**
	 * ����
	 */
	private int Age;
	/**
	 * �Ա�
	 */
	private String Sex;

	/**
	 * �û�����
	 */
	private String Usertype;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getUsertype() {
		return Usertype;
	}

	public void setUsertype(String usertype) {
		Usertype = usertype;
	}

	public BookUser(Integer id, String name, String password, int age,
			String sex, String usertype) {
		super();
		Id = id;
		Name = name;
		Password = password;
		Age = age;
		Sex = sex;
		Usertype = usertype;
	}

	public BookUser() {
		super();
	}

}

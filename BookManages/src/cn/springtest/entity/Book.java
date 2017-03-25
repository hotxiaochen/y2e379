package cn.springtest.entity;

import java.util.Date;

/**
 * ͼ����Ϣ��
 * 
 * @author Yuan
 * 
 */
public class Book {

	/**
	 * ͼ��id
	 */
	private Integer Id;
	/**
	 * ͼ������
	 */
	private String Name;
	/**
	 * ͼ������
	 */
	private String Atuthor;
	/**
	 * ������
	 */
	private String Publish;
	/**
	 * ��������
	 */
	private Date PublishDate;

	/**
	 * ҳ��
	 */
	private int Page;
	/**
	 * �۸�
	 */
	private int Price;
	/**
	 * ����
	 */
	private String Content;

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

	public String getAtuthor() {
		return Atuthor;
	}

	public void setAtuthor(String atuthor) {
		Atuthor = atuthor;
	}

	public String getPublish() {
		return Publish;
	}

	public void setPublish(String publish) {
		Publish = publish;
	}

	public Date getPublishDate() {
		return PublishDate;
	}

	public void setPublishDate(Date publishDate) {
		PublishDate = publishDate;
	}

	public int getPage() {
		return Page;
	}

	public void setPage(int page) {
		Page = page;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Book(Integer id, String name, String atuthor, String publish,
			Date publishDate, int page, int price, String content) {
		super();
		Id = id;
		Name = name;
		Atuthor = atuthor;
		Publish = publish;
		PublishDate = publishDate;
		Page = page;
		Price = price;
		Content = content;
	}

	public Book() {
		super();
	}

}

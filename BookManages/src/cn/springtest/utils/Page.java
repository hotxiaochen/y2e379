package cn.springtest.utils;

import java.util.List;

public class Page<T> {

	private T t;
	private List<T> list;// 每页的集合
	private Integer pageIndex = 1;// 第几页
	private Integer pageSize = 2;// 显示记录数
	private Integer count;// 总记录数
	private Integer totalPage;// 总页数

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getTotalPage() {

		this.totalPage = this.count % this.pageSize == 0 ? this.count
				/ this.pageSize : this.count / this.pageSize + 1;

		return totalPage;
	}

}

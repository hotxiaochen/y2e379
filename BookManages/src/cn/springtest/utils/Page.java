package cn.springtest.utils;

import java.util.List;

public class Page<T> {

	private T t;
	private List<T> list;// ÿҳ�ļ���
	private Integer pageIndex = 1;// �ڼ�ҳ
	private Integer pageSize = 2;// ��ʾ��¼��
	private Integer count;// �ܼ�¼��
	private Integer totalPage;// ��ҳ��

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

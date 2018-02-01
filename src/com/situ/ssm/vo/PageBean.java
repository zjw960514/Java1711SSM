package com.situ.ssm.vo;

import java.util.List;

import com.situ.ssm.entity.Student;


public class PageBean<T> {
		//当前是第几页
		private Integer pageNo ;
		//一页有多少数据
		private Integer pageSize;
		//总数据记录数
		private Integer totalCount;
		//一共有多少页
		private int totalPage;
		//当前页的数据(以集合显示)
		private List<Student> list;
		public Integer getPageNo() {
			return pageNo;
		}
		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}
		public Integer getPageSize() {
			return pageSize;
		}
		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}
		public Integer getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}
		public int getTotalPage() {
			return totalPage;
		}
		public void setTotalPage(int totalPage) {
			this.totalPage = totalPage;
		}
		public List<Student> getList() {
			return list;
		}
		public void setList(List<Student> list) {
			this.list = list;
		}
		@Override
		public String toString() {
			return "pageBean [pageNo=" + pageNo + ", pageSize=" + pageSize + ", totalCount=" + totalCount
					+ ", totalPage=" + totalPage + ", list=" + list + "]";
		}
		
		
}

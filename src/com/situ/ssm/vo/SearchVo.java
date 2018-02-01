package com.situ.ssm.vo;

import java.util.Arrays;
import java.util.List;

public class SearchVo {
	private int[] array;
	private List<Integer> idList;
	
	
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}
	public List<Integer> getIdList() {
		return idList;
	}
	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}
	@Override
	public String toString() {
		return "SearchVo [array=" + Arrays.toString(array) + ", idList=" + idList + "]";
	}
	
	
}

package com.cjn.entity;

public class Type {
	private int TypeId;// 商品id
	private String TypeName;// 商品名称

	public int getTypeId() {
		return TypeId;
	}

	public void setTypeId(int typeId) {
		TypeId = typeId;
	}

	public String getTypeName() {
		return TypeName;
	}

	public void setTypeName(String typeName) {
		TypeName = typeName;
	}

	@Override
	public String toString() {
		return "Type [TypeId=" + TypeId + ", TypeName=" + TypeName + "]";
	}
}

package com.cjn.entity;

public class Good {
	private int GoodId;// 商品id
	private String GoodName;// 商品名称
	private double GoodPrice;// 商品价格
	private Type GoodType;// 商品种类名称
	private int GoodStore;// 商品库存

	public int getGoodId() {
		return GoodId;
	}

	public void setGoodId(int goodId) {
		GoodId = goodId;
	}

	public String getGoodName() {
		return GoodName;
	}

	public void setGoodName(String goodName) {
		GoodName = goodName;
	}

	public double getGoodPrice() {
		return GoodPrice;
	}

	public void setGoodPrice(double goodPrice) {
		GoodPrice = goodPrice;
	}

	public Type getGoodType() {
		return GoodType;
	}

	public void setGoodType(Type goodType) {
		GoodType = goodType;
	}

	public int getGoodStore() {
		return GoodStore;
	}

	public void setGoodStore(int goodStore) {
		GoodStore = goodStore;
	}

	@Override
	public String toString() {
		return "Good [GoodId=" + GoodId + ", GoodName=" + GoodName + ", GoodPrice=" + GoodPrice + ", GoodType="
				+ GoodType + ", GoodStore=" + GoodStore + "]";
	}

}

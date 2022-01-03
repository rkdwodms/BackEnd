package com.example.javac.goods.copy2;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods notebook = new Goods();
		notebook.name = "LG Gram";
		notebook.price = 1500000;
		
		
		Goods mba = new Goods();
		mba.name = "Mac";
		mba.price = 1600000;
		
		//출력
		
		System.out.printf("%s, %d원%n",
				notebook.name,
				notebook.price);
		
		System.out.printf("%s, %d원%n",
				mba.name,
				mba.price);

	}

}

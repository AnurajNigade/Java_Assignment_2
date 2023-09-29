package com.dbda.main;

import java.util.ArrayList;
import java.util.List;

public class ProductCatlog {
	String name;
	double price;
	int qunt_in_stock;
	
	public ProductCatlog(String name,double price,int qunt_in_stock) {
		this.name=name;
		this.price=price;
		this.qunt_in_stock=qunt_in_stock;
		
	}
	public static void main(String[] args) {
		List<ProductCatlog> prod = new ArrayList<>();
		
		prod.add(new ProductCatlog("MilkBottel", 50, 100));
		prod.add(new ProductCatlog("Bread", 35, 111));
		prod.add(new ProductCatlog("Biscuit", 5,555 ));
		prod.add(new ProductCatlog("Choclate", 10, 1000));
//		prod.add(new ProductCatlog("MilkBottel", 50, 100));
		
		for (ProductCatlog i : prod) {
			System.out.println("Product Name : "+i.name);
			System.out.println("Price of product : "+i.price);
			System.out.println("Remaining stock of product : "+i.qunt_in_stock);
			System.out.println();
		}
		
		
	}
}

package com.dio;

import com.dio.model.Cat_Model;

public class FirstProgram {

	public static void main(String[] args) {
		Cat_Model cat = new Cat_Model();
		Books books = new Books();
		
		System.out.println(cat);
		System.out.println(books);
	}
}
class Books {
	private String name;
	private String page_number;
}
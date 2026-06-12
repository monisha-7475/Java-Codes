package com.gqt.FileHandling.java;

import java.util.ArrayList;

public class Example5 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sachin");
		al.add("dhoni");
		al.add("virat");
		al.add("krishna");
		System.out.println(al);
		System.out.println("-----------");
		int count = 0;
		for(int i =0;i<al.size();i++) {
			if(al.get(i).length()==5) {
				count++;
			}
		}
		System.out.println(count);
	}
}
	
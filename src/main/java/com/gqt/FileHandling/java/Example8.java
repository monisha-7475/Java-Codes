package com.gqt.FileHandling.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(122);
		al.add(45);
		al.add(46);
		al.add(54);
		al.add(95);
		al.add(75);
		al.add(56);
		al.add(67);
		al.add(907);
		System.out.println(al);
		System.out.println("-----------");
		List<Integer> res = al.stream().sorted().collect(Collectors.toList());
		System.out.println(res);
	}
}
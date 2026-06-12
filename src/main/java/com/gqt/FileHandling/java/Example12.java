package com.gqt.FileHandling.java;

import java.util.ArrayList;
import java.util.Collections;

public class Example12 {
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
		System.out.println(al);
		System.out.println("-----------");
		Integer min = al.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("The min valued string  is = " + min);
		System.out.println("----------------------");
		Integer max = al.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("The min valued string  is = " + max);
	}
}

		
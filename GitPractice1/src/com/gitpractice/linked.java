package com.gitpractice;

import java.util.Iterator;
import java.util.LinkedList;

public class linked {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		Iterator<Integer> itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

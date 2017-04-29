package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> list = new LinkedList<String>();

		list.add("Mizan");
		list.add("Rafique");
		list.add("Sharif");
		   System.out.println(list.get(1));
		list.remove(2);
		   System.out.println(list);
		for (String st:list){
		   System.out.println(list);
		}
		Iterator<String> ir = list.iterator();
		while(ir.hasNext()){
		   System.out.println(ir.next());
		}
	}
}

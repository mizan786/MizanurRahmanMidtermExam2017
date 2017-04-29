package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> list = new LinkedList<String>();
		Queue<String> que = new LinkedList<String>();
		que.add("USA");
		que.add("Japan");
		que.add("Itali");
		que.add("Germany");
		Iterator it = que.iterator();
		while(it.hasNext()){
			System.out.println(que.remove());
		}
	}
}

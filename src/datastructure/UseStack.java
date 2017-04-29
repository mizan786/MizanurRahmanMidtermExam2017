package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String> stc = new Stack<String>();
		stc.push("USA");
		stc.push("UK");
		stc.push("Japan");
		stc.push("Itali");
		stc.push("Germany");
		Iterator it = stc.iterator();
		while( it.hasNext()){
			System.out.println(stc.pop());
		}
	}
}

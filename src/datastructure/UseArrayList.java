package datastructure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter your number");
		for (int i = 0; i <= 15; i++){
			list.add(i);
		}
		    System.out.println(list.get(8));
		list.remove(4);
		    System.out.println(list);
		for (Integer arrayList:list){

			System.out.println(arrayList +" ");
		}
		    System.out.println();
		Iterator it = list.iterator();
		    while(it.hasNext()){
			System.out.println(it.next()+" ");
		}
	}
 }



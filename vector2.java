package Project_task;

import java.util.Scanner;
import java.util.Vector;

//import javax.print.attribute.Size2DSyntax;

public class vector2  {
	public static void sell(Vector<String> v, Vector<Integer> v1, String s, int q) {
	
		if(v.contains(s)) {
		int count = v.indexOf(s);
		int ind =  v1.get(count )-q;
		int qet =  v1.set(count,ind);
		System.out.println(v);
		System.out.println(v1);
		}
		
		//else if(v1.size()<=q)  {
			//System.out.println("Quantity Limit Exceeds");
		}	

		}
	


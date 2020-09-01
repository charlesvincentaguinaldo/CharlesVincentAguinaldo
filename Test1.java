
import java.util.*;

public class Test1 args) {
		
		
		Date d1 = new Date (9,24,2002);
		Date d2 = new Date (7,27,2020);
		Date d3 = new Date (9,26,2002);
		Date d4 = new Date (6,9,2015);
		
		TreeMap<Date, String> syllabus = new TreeMap();
		syllabus.put (d1, "Java");
		syllabus.put (d2, "C++");
		syllabus.put (d3, "Python");
		syllabus.put (d4, "JavaScript");
		for (Map.Entry<Date, String>entry: syllabus.entrySet()) {
			if (entry.getKey().month == 9 && entry.getKey().year == 2002) {
				System.out.println (entry.getValue());
			}
		}
		
		
		
		Date d1 = new Date (8,24,2020);
		Date d2 = new Date (8,24,2020);
		
		if (d1.compareTo(d2) == 1) {
			System.out.println (d1 + " is later than " + d2);
		} else if(d1.compareTo (d2)==1) {
			System.out.println (d2 + " is later than " + d2);
		} else {
			System.out.println (d1 +" and " + d2 +" are the same dates ");
		}
		

		
		
		ArrayList<Integer> ints = new ArrayList();
		ints.add(20);
		ints.add(13);
		ints.add(25);
		
		
		Numbers nums = new Numbers(ints);
		System.out.println("sum = " + nums.computeSum());
		*/
		
		
		
		tableOfSquares(2);
	}
	
	static void tableOfSquares(int n){
		for (int i=1; i<= n; i++) {
			System.out.println("The square of " + i  +" is " + i*i);
		}
	}
	static void tablesofSquares(int i, int n) {
		if (i <= n) {
			System.out.println(i + " ^2 =  " + i*i);
			tableOfSquares(i+1);
		} else {
			return;
		}
	
	}

}

import java.util.ArrayList;

public class Integer {
	ArrayList<Integer> nums = new ArrayList();
	
	Numbers(ArrayList<Integer> x) {
		nums = x;
	}
	
	int computeSum() {
		int sum = 0;
		for(int num: nums) {
			sum = sum + num;
			
		}
		return sum;
	}

}

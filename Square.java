
public class square {

	public static void main(String[] args) {
		getSquare (5); 
		getSquare2 (1, 5); 
	
	}

	static  void getSquare (int n) {
		for (int i = 0; i < n || i ==n; i++) {
			System.out.println ("the square of " + i + " is " + i*i);
		}
	}
	
	static void getSquare2 (int i, int n) {
		if (i < n || i == n) {
			System.out.println(i + " , " + i*i);
			getSquare2 (i + 1, n);
		} else {
			return;
		}
	}

}
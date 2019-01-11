package _01_introduction_to_encapsulation;



public class hoboShare {

	
	int[] hoboshare(int[] V, int n) {
		int[] shares = new int[n];
		for (int i = 0; i < V.length; i++) {
			shares[i % n] += V[i];

		}
		return (shares);
	}

	public static void main(String[] args) {
		int n = 2;
		int[] V = { 5, 8, 10, 3 };
		hoboShare korean = new hoboShare();
		int[] shares = korean.hoboshare(V, n);
		
		for (int i = 0; i < n; i++) {
			System.out.println(shares[i]);
		}

	}

}

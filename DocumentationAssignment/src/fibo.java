import java.util.Scanner;

public class fibo {
// Gener Almestica
	public static void main(String[] args) {
		diffMethods test1 = new diffMethods();
		diffMethods test2 = new diffMethods();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter last element of the Fibonacci Sequence.");

		int x = sc.nextInt();
		System.out.println();

		// iteration
		long start = System.nanoTime();
		System.out.println("Fibonacci Sequence Iterated to " + x + " is: " + test1.fibIter(x));
		long end = System.nanoTime();
		long length = (end - start) ;
		System.out.println("Time: " + length + " nanoseconds");
		System.out.println();

		// recursive
		long begin = System.nanoTime();
		System.out.println("Recursively Sequenced Fibonacci " + x + " is: " + test2.fibRecur(x));
		long fin = System.nanoTime();
		long dura = (fin - begin);
		System.out.println("Time: " + dura + " nanoseconds");
		System.out.println();

		sc.close();

	}

}

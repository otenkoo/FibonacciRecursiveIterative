
public class diffMethods {

	public int fibIter(int b) {

		int x = 0, y = 1, z = 1;

		for (int i = 0; i < b; i++) {
			x = y;
			y = z;
			z = x + y;
		}
		return x;

	}

	public int fibRecur(int b) {

		if ((b == 1) || (b == 0)) {
            return b;
        }
        return fibRecur(b - 1) + fibRecur(b - 2);
	}

}

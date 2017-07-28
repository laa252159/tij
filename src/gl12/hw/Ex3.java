package gl12.hw;

public class Ex3 {
	public static void main(String[] args) {
		int[] vals = { 1, 2 };
		try {
			System.out.println(vals[3]);
		} catch (ArrayIndexOutOfBoundsException ex){
			System.out.println(ex);
		}
	}
}

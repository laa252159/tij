package gl12.hw;

public class Ex3 {
	public static void main(String[] args) {
		int[] vals = { 1, 2 };
		try {
			System.out.println(vals[3]);
			throw new MyException("dd");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		} catch (MyException me) {
			System.out.println(me.getStr());
		}
	}
}

package gl12.hw;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Ex7 {
	public static void main(String[] args) {
		int[] vals = { 1, 2 };
		try {
			System.out.println(vals[3]);
			throw new MyException("dd");
		} catch (ArrayIndexOutOfBoundsException ex) {
//			StringWriter strWriter = new StringWriter();
//			ex.printStackTrace(new PrintWriter(strWriter));
//			System.out.println(strWriter.toString());
			ex.printStackTrace(System.out);
		} catch (MyException me) {
//			StringWriter strWriter = new StringWriter();
//			me.printStackTrace(new PrintWriter(strWriter));
//			System.out.println(strWriter.toString());
			me.printStackTrace();
		}
	}
}

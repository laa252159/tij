package gl12.hw;

public class Ex8 {
	public static void main(String[] args) {
		try {
			execute();
		} catch (MyException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStr());
			e.printStackTrace();
		}
	}

	private static void execute() throws MyException {
		throw new MyException("Ex8");
	}
}

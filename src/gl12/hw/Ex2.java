package gl12.hw;

public class Ex2 {
	public static void main(String[] args) {
		try {
			Object object = null;
			object.toString();
		} catch (RuntimeException ex){
			System.out.println("ex :" + ex);
			System.out.println("message :" + ex.getMessage());
		}
	}
}

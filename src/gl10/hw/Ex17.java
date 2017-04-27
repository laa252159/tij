package gl10.hw;

public class Ex17 {
	private static class Injected {
		void print(){
			System.out.println("Ex17");
		}
	}
	public static void main(String[] args){
	   Injected i = new Injected();
	   i.print();
	}
}

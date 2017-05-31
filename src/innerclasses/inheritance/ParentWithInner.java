public class ParentWithInner {
	private String commonField;

	public ParentWithInner(String commonField) {
		this.commonField = commonField;
	}

	public class InnerInParent {
		private int i;
		private String s;

		public InnerInParent() {
		}

		public InnerInParent(int i, String s, String commonF) {
			commonField = commonF;
			this.i = i;
			this.s = s;
		}

		public String toString() {
			return "i = " + i + " s = " + s + " Common = " + commonField;
		}
	}

	public static void main(String[] args) {
		ParentWithInner parent = new ParentWithInner("***");
		Child c = new Child(parent);
		System.out.println(c);
	}
}

class Child extends ParentWithInner.InnerInParent {
	Child(ParentWithInner p) {
		p.super();
	}

}

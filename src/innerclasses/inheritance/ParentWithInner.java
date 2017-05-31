package innerclasses.inherit;

public class ParentWithInner {
   private String commonField;

   public class InnerInParent {
      private int i;
      private String s;
      public InnerInParent(int i, String s, String commonF){
         commonField = commonF;
	 this.i = i;
	 this.s = s;
      }

      protected String toSting(){
         return "i = " + i + " s = " + s + " Common = " + commonField;
      }
   }

   public static void main(String[] args) {
      ParentWithInner parent = new ParentWithInner();
      InnerInParent inner = new InnerInParent(0, "**");
      ChildWithInner.InnerInChild inner = (new ChildWithInner()).new InnerInChild(inner);     
      System.out.println(inner);
   }
}

class ChildWithInner {
   public class InnerInChild extends ParentWithInner.InnerInParent {
      public InnerInChild(InerIn Parent parent) {
	 parent.this();
	 super(7, 007, "!Common2!");
      }   
   }
}

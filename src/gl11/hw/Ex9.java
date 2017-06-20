
package gl11.hw;
// Holds a sequence of Objects.
import java.util.*;

interface Selector {
  boolean end();
  Object current();
  void next();
}	

interface ReverseSelector {
  boolean end();
  Object current();
  void previous();
}	

public class Sequence {
  private List<Object> items;
  private int next = 0;
  
  private String strSeq;

  public Sequence(int size) { 
     items = new ArrayList<Object>(size); 
     strSeq = "SsssSsss";
  }
  public void add(Object x) {
    items.add(x);
  }


  private class SequenceSelector implements Iterator {
    private int i = 0;
    public boolean hasNext() { return i < items.size(); }
    public Object next() { return items.get(i); }
  }


  public Selector selector() {
    return new SequenceSelector();
  }

  public ReverseSelector reverseSelector() {
    return new SequenceReverseSelector();
  }


  class MyType {
     String d = String.valueOf(new Date());
     public String toSting(){
        return "Number :" + d;
     }
     public String getOuterString(){
        return strSeq;
     }
  }

  MyType getMyType(){
     return new MyType();
  }

  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
   ReverseSelector reverseSelector = sequence.reverseSelector();
   Selector selector = sequence.selector();

   while(!reverseSelector.end()) {
      System.out.println(reverseSelector.current() + " R");
         //Object m = reversSselector.current();
      reverseSelector.previous();
   }
      System.out.println("--------");
   while(!selector.end()) {
      System.out.println(selector.current() + " S");
    //     Object m = selector.current();
      selector.next();
   }
  }
}


class OuterClass {
   public class InnerClass {
      InnerClass(){
         System.out.println("Object " + this.getClass() + " made");
      }
   }
}

/* Output:
0 1 2 3 4 5 6 7 8 9
*///:~

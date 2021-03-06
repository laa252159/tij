
package innerclasses;
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
      if (items.size() > 20) throw new RuntimeException("Слишком много айтемов");
    items.add(x);
  }


  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.size(); }
    public Object current() { return items.get(i); }
    public void next() { if(i < items.size()) i++; }
    public Sequence getParent(){
       return Sequence.this;
    }
  }


  private class SequenceReverseSelector implements ReverseSelector {
    private int i = items.size() - 1 ;
    public boolean end() { return i == -1; }
    public Object current() { return items.get(i); }
    public void previous() { if(i > -1) i--; }
    public Sequence getParent(){
       return Sequence.this;
    }
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
    for(int i = 0; i < 25; i++)
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

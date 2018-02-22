
package gl15.hw;
// Holds a SequenceGeneric of Ts.

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

interface Selector <T>{
  boolean end();
  T current();
  void next();
}

interface ReverseSelector<T> {
  boolean end();
  T current();
  void previous();
}

public class SequenceGeneric<T> {
  private List<T> items;
  private int next = 0;
  
  private String strSeq;

  public SequenceGeneric(int size) {
     items = new ArrayList<T>(size); 
     strSeq = "SsssSsss";
  }
  public void add(T x) {
      if (items.size() > 200) throw new RuntimeException("Слишком много айтемов");
    items.add(x);
  }


  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.size(); }
    public T current() { return items.get(i); }
    public void next() { if(i < items.size()) i++; }
    public SequenceGeneric getParent(){
       return SequenceGeneric.this;
    }
  }


  private class SequenceReverseSelector implements ReverseSelector {
    private int i = items.size() - 1 ;
    public boolean end() { return i == -1; }
    public T current() { return items.get(i); }
    public void previous() { if(i > -1) i--; }
    public SequenceGeneric getParent(){
       return SequenceGeneric.this;
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
    SequenceGeneric<String> sequence = new SequenceGeneric<>(10);
    for(int i = 0; i < 25; i++)
      sequence.add(Integer.toString(i));
   ReverseSelector<String> reverseSelector = sequence.reverseSelector();
   Selector<String> selector = sequence.selector();

   while(!reverseSelector.end()) {
      System.out.println(reverseSelector.current() + " R");
         //T m = reversSselector.current();
      reverseSelector.previous();
   }
      System.out.println("--------");
   while(!selector.end()) {
      System.out.println(selector.current() + " S");
    //     T m = selector.current();
      selector.next();
   }
  }
}


class OuterClass {
   public class InnerClass {
      InnerClass(){
         System.out.println("T " + this.getClass() + " made");
      }
   }
}

/* Output:
0 1 2 3 4 5 6 7 8 9
*///:~

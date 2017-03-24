
package innerclasses;
// Holds a sequence of Objects.
import java.util.Date;
interface Selector {
  boolean end();
  Object current();
  void next();
}	

public class Sequence {
  private Object[] items;
  private int next = 0;
  
  private String strSeq;

  public Sequence(int size) { 
     items = new Object[size]; 
     strSeq = "SsssSsss";
  }
  public void add(Object x) {
    if(next < items.length)
      items[next++] = x;
  }


  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public Object current() { return items[i]; }
    public void next() { if(i < items.length) i++; }
  }
  public Selector selector() {
    return new SequenceSelector();
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
    Sequence sequence = new Sequence(15);
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
    MyType mt1 = sequence.getMyType();
    MyType mt2 = sequence.getMyType();
    MyType mt3 = sequence.getMyType();
    MyType mt4 = sequence.getMyType();
    sequence.add(mt1);
    sequence.add(mt2);
    sequence.add(mt3);
    sequence.add(mt4);
    Selector selector = sequence.selector();
    while(!selector.end()) {
      System.out.println(selector.current() + " ");
         Object m = selector.current();
      if(m instanceof MyType){
         System.out.print(new Date() + "@@ " + ((MyType)m).getOuterString());
      }
      selector.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~

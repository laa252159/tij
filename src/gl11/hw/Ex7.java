package gl11.hw;

import java.util.*;

public class Ex7 {
   public static void main(String[] args){
      Model[] models = new Model[]{new Model(0), new Model(1), new Model(2)};
      List<Model> modelsList = new LinkedList<Model>(Arrays.asList(models));
      System.out.println("ModelList :" + modelsList);
      List<Model> sublist = modelsList.subList(1,3);
      System.out.println("sublist :" + sublist);
      List<Model> copy = new ArrayList<Model>(modelsList);
      copy.removeAll(sublist);
      System.out.println("After sublist removing :" + copy);
   }
}

class Model{
  
  public Model(int i){
     name = "Model " + i;
  }

  private String name;

  public String toString(){
     return name;
  }

}

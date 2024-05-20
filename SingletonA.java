import java.util.*;

class SingletonA{
  
  private static SingletonA instance = new SingletonA();
  private static ArrayList<Integer> list = new ArrayList<>();


  private void SingletonA() {
      // Constructor privado para evitar instanciación externa
  }
  
  public static SingletonA getInstance() {
    return instance;
  }

  public void add(int data){
    list.add(data);
  }

  public void remove(int data) {
      Iterator<Integer> iterator = list.iterator();
      while (iterator.hasNext()) {
          int dato = iterator.next();
          if (data == dato) {
              iterator.remove();
          }
      }
  }

  public void getData(){
    for (int dato : list){
      System.out.println(list.indexOf(dato)+ dato);
    }

    System.out.println("Total: " + list.size());
  }
}
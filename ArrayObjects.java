import java.util.*;

class ArrayObjects{

  private static ArrayObjects instance = new ArrayObjects();
  private static ArrayList<Computador> list = new ArrayList<>();


  private ArrayObjects() {
      // Constructor privado para evitar instanciación externa
  }

  public static ArrayObjects getInstance() {
    return instance;
  }

  public void add(Computador data){
    list.add(data);
  }

  public void remove(int data) {
    list.remove(data);
  }

  public void getData(){
    for (Computador dato : list){
      System.out.println(list.indexOf(dato) + dato.toString());
    }

    System.out.println("Total: " + list.size());
  }
}
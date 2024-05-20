import java.util.*;

public class Main {
  public static void main(String[] args) {
      while (true){
        Scanner scanner = new Scanner(System.in);
        int dataHandler;
        int optionHandler;
        
        System.out.println("1. SingletonA   -   Lista simple de enteros");
        System.out.println("2. ArrayObjects -   Lista de objetos");
    
        optionHandler = scanner.nextInt();
        while (true){
          switch(optionHandler){
            case 1:
              System.out.println("1. Agregar");
              System.out.println("2. Eliminar");
              System.out.println("3. Mostrar");
        
              optionHandler = scanner.nextInt();
              switch(optionHandler){
                case 1:
                  System.out.println("Ingrese el dato a agregar:");
                  dataHandler = scanner.nextInt();
                  SingletonA.getInstance().add(dataHandler);
                  System.out.println("Dato agregado exitosamente");
                  break;
                case 2:
                  System.out.println("Ingrese el dato a eliminar:");
                  dataHandler = scanner.nextInt();
                  SingletonA.getInstance().remove(dataHandler);
                  System.out.println("Dato eliminado exitosamente");
                  break;
                case 3:
                  System.out.println("Datos en la lista:");
                  SingletonA.getInstance().getData();
                  break;
              }
              break;
            case 2:
              System.out.println("1. Agregar");
              System.out.println("2. Eliminar");
              System.out.println("3. Mostrar");

              optionHandler = scanner.nextInt();
              switch(optionHandler){
                case 1:
                  System.out.println("Instanciando objeto y añadiendo.."); //add dynamic additions via constructors
                  Computador computador = new Computador();
                  ArrayObjects.getInstance().add(computador);
                  System.out.println("Objeto agregado exitosamente");
                  break;
                case 2: //identificar objeto por id
                  System.out.println("Ingrese el dato a eliminar:");
                  dataHandler = scanner.nextInt();
                  ArrayObjects.getInstance().remove(dataHandler);
                  System.out.println("Dato eliminado exitosamente");
                  break;
                case 3:
                  System.out.println("Datos en la lista:");
                  ArrayObjects.getInstance().getData();
                  break;
            }
          }
        }
      }
  }
}
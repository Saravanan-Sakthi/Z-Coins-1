/*package Z_Coin;
import java.util.Scanner;
public abstract class Input {
  static Scanner s= new Scanner(System.in);
  abstract void start();
  Input in;
  void setIn(Input in){
    this.in=in;
  }
  static void modules() {
    while (true){
      System.out.println("1. Register");
      System.out.println("2. Login");
      System.out.println("3. Exit");
      System.out.println("Enter the option:");
      int option= s.nextInt();
      s.nextLine();
      switch(option){
        case 1:{
          new Register().start();
          break;
        }
        case 2:{
          new Login().start();
          break;
        }
        case 3:{
          System.out.println("Thank you");
          break;
        }
        default:{
          System.out.println("Inalid input\n");
        }
      }
    }
  }
}*/

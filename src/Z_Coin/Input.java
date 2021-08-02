package Z_Coin;
import java.util.Scanner;
public abstract class Input {
  static Scanner s= new Scanner(System.in);
  abstract void start();
  Input in;
  void setIn(Input in){
    this.in=in;
  }
  static void type(int option){
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
        break;
      }
      default:{
        System.out.println("Inalid input\n");
      }
    }
  }
  static void getinput(){
    while (true){
      System.out.println("1. Register");
      System.out.println("2. Login");
      System.out.println("3. Exit");
      System.out.println("Enter the option:");
      int option= s.nextInt();
      s.nextLine();
      if (option==3){
        System.out.println("Thank You");
        break;
      }
      else type(option);
    }
  }
}

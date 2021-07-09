package Z_Coin;
import java.util.Scanner;
public class Login extends Input{
  static Scanner s= Input.s;
  void start(){
    System.out.println();
    System.out.println("Enter your Email ID: ");
    String email= s.nextLine();
    String pass="";
    if (UserID.users.containsKey(email)) {
      System.out.println("Enter the password: ");
      pass=s.nextLine();
        if(verifypass(email,pass)) user(email);
        else System.out.println("Wrong Password");
    }
    else {
      System.out.println("User name may be wrong please enter correctly\n");
    }
  }
  boolean verifypass(String email, String pass){
    if (UserID.users.get(email).password.equals(pass)) return true;
    else{
      System.out.println("Wrong Password Try again\n");
      return false;
    }
  }
  void user(String email){
    System.out.println("Login successfull\n");
    //AgentUser.switch(email);
      while (true){
        System.out.println("1. Account management");
        System.out.println("2. logout");
        System.out.println("Enter the option: ");
        int n= s.nextInt();
        s.nextLine();
        System.out.println();
        UserID u =UserID.users.get(email);
        if (n==1){
          if (u.ze) new ZeUser().start(u);
          if (!u.ze) new NormalUser().start(u);
        }
        else if (n==2) {
          System.out.println("Thank you\n");
          break;
        }
        else System.out.println("Invalid input\n");
      }

  }
}

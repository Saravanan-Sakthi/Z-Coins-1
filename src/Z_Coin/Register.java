package Z_Coin;
import java.util.Scanner;
public class Register extends Input {
  static Scanner s= Input.s;
  void start(){
    System.out.println();
    UserID u= new UserID();
    System.out.println("Enter your name: ");
    u.name=s.nextLine();
    System.out.println("Enter your Email ID: ");
    u.email= s.nextLine();
    System.out.println("Enter your Mobile number: ");
    u.mobile=s.nextLine();
    int ask=asktype();
    if (ask==1) u.ze=true;
    else if (ask==2) u.ze=false;
    else {
      System.out.println("Invalid input try again:");
      asktype();
    }
    System.out.println("Enter your H_ID: ");
    u.H_ID=s.nextLine();
    new Password().createpassword(u);
    if (ask==1) {
      u.Z_ID=UserID.zid;
      UserID.users.put(u.email,u);
      UserID.IDUsers.put(UserID.zid++,u.email);
    }
    if (ask==2) UserID.requests.put(u.email,u);
    System.out.println("Your Request for registration is submitted successfully\n");
  }
  int asktype(){
    System.out.println("Are you a ze : 1. Yes     2.No  ");
    int n= s.nextInt();
    s.nextLine();
    return n;
  }
}

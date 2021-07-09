package Z_Coin;
import java.util.Scanner;
public class NormalUser{
  static Scanner s= Input.s;
  void start(UserID u){
    while(true){
      System.out.println();
      System.out.println("1. Account details");
      System.out.println("2. Transaction history");
      System.out.println("3. Change Password");
      System.out.println("4. RC Tranaction");
      System.out.println("5. ZC Transaction");
      System.out.println("6. Exit");
      int n= s.nextInt();
      s.nextLine();
      System.out.println();
      Transactions T;
      if (n==1) accountdetails(u);
      if (n==2) Transactions.userhistory(u);
      else if (n==3) new Password().createpassword(u);
      else if (n==4) {
        T= new RCTransactions();
        T.start(u);
      }
      else if (n==5){
        T= new ZCTransactions();
        T.start(u);
      }
      else if (n==6) break;
      else System.out.println("Invalid input");
    }
  }
  void accountdetails(UserID u){
    System.out.println("Z_ID          : "+u.Z_ID);
    System.out.println("Name          : "+u.name);
    System.out.println("Email         : "+u.email);
    System.out.println("Mobile        : "+u.mobile);
    System.out.println("H_ID          : "+u.H_ID);
    System.out.println("Real Currency : "+u.RC);
    System.out.println("Z Coins       : "+u.ZC);
  }
}

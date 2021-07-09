package Z_Coin;
import java.util.*;
public class ZeUser {
  static Scanner s= Input.s;
  static private int zrate=2;
  static int getrate(){
    return zrate;
  }
  void requests(){
    while(true){
      System.out.println("No of requests: "+ UserID.requests.size());
      System.out.println("1. Accept all");
      System.out.println("2. Reject all");
      System.out.println("3. View requests");
      System.out.println("4. Exit");
      int n= s.nextInt();
      s.nextLine();
      System.out.println();
      if (n==1) addall();
      else if (n==2) UserID.requests.clear();
      else if (n==4) break;
      else System.out.println("Invalis input");
    }
  }
  void addall(){
    for (Map.Entry request:UserID.requests.entrySet()){
      UserID u= (UserID)request.getValue();
      u.Z_ID= UserID.zid;
      UserID.users.put((String)request.getKey(),u);
      UserID.IDUsers.put(UserID.zid++,u.email);
    }
    UserID.requests.clear();
  }
  void start(UserID u){
    while(true){
      System.out.println("1. Requests");
      System.out.println("2. See Transactions");
      System.out.println("3. Exit");
      System.out.println("Enter the option");
      int n= s.nextInt();
      s.nextLine();
      System.out.println();
      if (n==1) requests();
      else if (n==2) Transactions.allhistory();
      else if(n==3) break;
      else System.out.println("Invalid input");
    }
  }
}

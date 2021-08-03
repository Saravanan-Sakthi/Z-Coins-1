package zcoin.accountmanagement;
import zcoin.details.Record;
import zcoin.details.UserInfo;
import zcoin.ZCoinDriver;

import java.util.HashMap;
import java.util.Scanner;
public class Login {
  static Scanner scan = ZCoinDriver.scan;
  public void checkCredentials(){
    System.out.println();
    System.out.println("Enter your Email ID: ");
    String email= scan.nextLine();
    String password ="";
    HashMap users= Record.getInstance().getUsers();
    UserInfo info= (UserInfo) users.get(email);
    if (info !=null) {
      System.out.println("Enter the password: ");
      password = scan.nextLine();
        if(verifypass(email, password)) {
          user(email);
        }
        else {
          System.out.println("Wrong Password");
        }
    }
    else {
      System.out.println("User name may be wrong please enter correct user name\n");
    }
  }
  boolean verifypass(String email, String pass){
    if (UserInfo.users.get(email).password.equals(pass)) return true;
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
        int n= scan.nextInt();
        scan.nextLine();
        System.out.println();
        UserInfo u = UserInfo.users.get(email);
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

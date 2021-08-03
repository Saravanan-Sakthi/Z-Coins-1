package zcoin.accountmanagement;
import zcoin.details.Record;
import zcoin.details.UserInfo;
import zcoin.ZCoinDriver;

import java.util.Scanner;
public class Register {
  static Scanner scan = ZCoinDriver.scan;
  public void start(){
    System.out.println();
    UserInfo info = new UserInfo();
    System.out.println("Enter your name: ");
    info.setName(scan.nextLine());
    System.out.println("Enter your Email ID: ");
    info.setEmail(scan.nextLine());
    System.out.println("Enter your Mobile number: ");
    info.setMobile(scan.nextLine());
    int ask=asktype();
    if (ask==1) {
      info.setZe(true);
    }
    else if (ask == 2) {
      info.setZe(false);
    }
    else {
      System.out.println("Invalid input try again:");
      asktype();
    }
    System.out.println("Enter your H_ID: ");
    info.setHID(scan.nextLine());
    new Password().createpassword(info);
    if (ask==1) {
      Record.getInstance().addUsers(info);
      System.out.println("Account added successfully");
    }
    if (ask==2) {
      Record.getInstance().addRequest(info);
      System.out.println("Your Request for registration is submitted successfully\n");
    }
  }
  int asktype(){
    System.out.println("Are you a ze : 1. Yes     2.No  ");
    int option = scan.nextInt();
    scan.nextLine();
    return option;
  }
}

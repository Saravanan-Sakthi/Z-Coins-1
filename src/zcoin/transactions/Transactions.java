package zcoin.transactions;
import zcoin.details.UserInfo;

import java.util.*;
public abstract class Transactions {
  static Scanner s= Input.s;
  static ArrayList <Transactions> zctransactions= new ArrayList<>();
  static ArrayList <Transactions> rctransactions= new ArrayList<>();
  int zid;
  double deposited;
  double withdrawn;
  double coins_bought;
  int tozid;
  double zcoins;
  double zctorc;
  abstract void start( UserInfo u);
  static void userhistory(UserInfo u){
    while(true){
      System.out.println("1. RC Transactions");
      System.out.println("2. ZC Transactions");
      System.out.println("3. Exit");
      System.out.println("Enter the option: ");
      int n= s.nextInt();
      s.nextLine();
      if (n==1) userrc(u);
      else if (n==2) userzc(u);
      else if (n==3) break;
      else System.out.println("Invalid input");
    }
  }
  static void userrc(UserInfo u){
    System.out.println("Z ID"+"         "+"Deposited"+"         "+"Withdrawn"+"         "+"Coins Bought");
    for (Transactions obj:u.rctransactions){
      System.out.println("  "+obj.zid +"            "+obj.deposited+"           "+obj.withdrawn+"              "+obj.coins_bought);
    }
  }
  static void userzc(UserInfo u){
    System.out.println("From ID"+"         "+"To ID"+"         "+"Z Coins"+"         "+"RC withdrawn");
    for (Transactions obj:u.zctransactions){
      System.out.println("  "+obj.zid +"            "+obj.tozid+"           "+obj.zcoins+"            "+obj.zctorc);
    }
  }
  static void allhistory(){
    while(true){
      System.out.println("1. RC Transactions");
      System.out.println("2. ZC Transactions");
      System.out.println("3. Exit");
      System.out.println("Enter the option: ");
      int n= s.nextInt();
      s.nextLine();
      if (n==1) allrc();
      else if (n==2) allzc();
      else if (n==3) break;
      else System.out.println("Invalid input");
    }
  }
  static void allrc(){
    System.out.println("Z ID"+"         "+"Deposited"+"         "+"Withdrawn"+"         "+"Coins Bought");
    for (Transactions obj:Transactions.rctransactions){
      System.out.println("  "+obj.zid +"            "+obj.deposited+"           "+obj.withdrawn+"              "+obj.coins_bought);
    }
  }
  static void allzc(){
    System.out.println("From ID"+"         "+"To ID"+"         "+"Z Coins"+"         "+"RC withdrawn");
    for (Transactions obj:Transactions.zctransactions){
      System.out.println("  "+obj.zid +"            "+obj.tozid+"           "+obj.zcoins+"            "+obj.zctorc);
    }
  }
}

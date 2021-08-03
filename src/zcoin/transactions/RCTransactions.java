package zcoin.transactions;
import zcoin.details.UserInfo;
import zcoin.ZCoinDriver;
import zcoin.accountmanagement.ZeUser;

import java.util.Scanner;
public class RCTransactions extends Transactions {
  static Scanner s= ZCoinDriver.scan;
  int zid;
  int deposited;
  int withdrawn;
  int coins_bought;
  void start (UserInfo u) {
    while(true){
      System.out.println("RC transactions");
      System.out.println("1. Deposit RC");
      System.out.println("2. Withdraw RC");
      System.out.println("3. Buy Z Coins");
      System.out.println("4. Exit");
      System.out.println("Enter the option");
      int n= s.nextInt();
      s.nextLine();
      System.out.println();
      if (n==1) deposit(u);
      else if (n==2) withdraw(u);
      else if (n==3) buy(u);
      else if (n==4) break;
      else System.out.println("Invalid input\n");
    }
  }
  void deposit( UserInfo u){
    Transactions R=new RCTransactions();
    R.zid=u.Z_ID;
    System.out.println("Enter the amount to be deposited: ");
    double amount= s.nextInt();
    s.nextLine();
    R.deposited=amount;
    u.RC=u.RC+amount;
    u.rctransactions.add(R);
    Transactions.rctransactions.add(R);
    System.out.println("Amount deposited successfully   New balance: "+u.RC +"\n");
  }
  void withdraw( UserInfo u){
    Transactions R=new RCTransactions();
    R.zid=u.Z_ID;
    System.out.println("Enter the amount to be withdrawn: ");
    double amount= s.nextInt();
    s.nextLine();
    if (u.RC-amount>=0){
      R.withdrawn=amount;
      u.RC=u.RC-amount;
      u.rctransactions.add(R);
      Transactions.rctransactions.add(R);
      System.out.println("Amount withdrawn successfully    New balance: "+u.RC +"\n");
    }
    else System.out.println("Insufficient balance\n");
  }
  void buy(UserInfo u){
    Transactions R=new RCTransactions();
    R.zid=u.Z_ID;
    System.out.println("Enter the number of coins: ");
    double n= s.nextInt();
    s.nextLine();
    if(n* ZeUser.getrate()<=u.RC){
      u.ZC= u.ZC+n;
      u.RC= u.RC-(n*ZeUser.getrate());
      R.coins_bought=n;
      u.rctransactions.add(R);
      Transactions.rctransactions.add(R);
      System.out.println("Z Coins bought successfully   New balance: "+u.ZC+"\n");
    }
    else System.out.println("Insufficient balance/n");
  }
}

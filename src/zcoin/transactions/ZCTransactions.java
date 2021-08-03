package zcoin.transactions;

import java.util.Scanner;
public class ZCTransactions extends Transactions {
  static Scanner s= Input.s;
  //int zid;
  int tozid;
  int zcoins;
  int zctorc;
  void start ( UserInfo u){
    while (true){
      System.out.println("ZC Transactions");
      System.out.println("1. Transfer Z Coins");
      System.out.println("2. Withdraw RC with Z Coins");
      System.out.println("3. Exit");
      System.out.println("Enter the option");
      int n= s.nextInt();
      s.nextLine();
      System.out.println();
      if (n==1) sendzc(u);
      else if (n==2) rcwithzc(u);
      else if (n==3) break;
      else System.out.println("Invalid input\n");
    }
  }
  void sendzc( UserInfo u){
    Transactions Z= new ZCTransactions();
    Z.zid=u.Z_ID;
    System.out.println("Enter the receivers Z ID : ");
    int toid= s.nextInt();
    s.nextLine();
    if (UserInfo.IDUsers.containsKey(toid)){
      Z.tozid=toid;
      System.out.println("Enter the number of coins to send : ");
      double n=s.nextInt();
      if (u.ZC-n>=0){
        Z.zcoins=n;
        u.ZC=u.ZC-n;
        UserInfo.users.get(UserInfo.IDUsers.get(toid)).ZC= UserInfo.users.get(UserInfo.IDUsers.get(toid)).ZC+n;
        u.zctransactions.add(Z);
        UserInfo.users.get(UserInfo.IDUsers.get(toid)).zctransactions.add(Z);
        Transactions.zctransactions.add(Z);
        System.out.println("Transaction successfull   New balance: "+u.ZC+"\n");
      }
      else System.out.println("Insufficient balance\n");
    }
    else System.out.println("Receiver ID incorrect\n");
  }
  void rcwithzc(UserInfo u){
    Transactions Z= new ZCTransactions();
    Z.zid=u.Z_ID;
    System.out.println("Enter the amount: ");
    double amount=s.nextInt();
    s.nextLine();
    double act=1.15*amount;
    if (u.ZC* ZeUser.getrate()-act>=0){
      u.ZC=u.ZC-act/ZeUser.getrate();
      Z.zctorc=act;
      u.zctransactions.add(Z);
      Transactions.zctransactions.add(Z);
      System.out.println("Transaction successfull   New balance: "+u.ZC+"\n");
    }
  }
}

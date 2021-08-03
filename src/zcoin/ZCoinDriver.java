package zcoin;

import zcoin.accountmanagement.Login;
import zcoin.accountmanagement.Register;

import java.util.Scanner;

public class ZCoinDriver{
  public static Scanner scan= new Scanner(System.in);
  public static void main(String [] abc){
    while (true) {
      System.out.println("1. Register");
      System.out.println("2. Login");
      System.out.println("3. Exit");
      System.out.println("Enter the option:");
      int option = scan.nextInt();
      scan.nextLine();
      switch (option) {
        case 1: {
          new Register().start();
          break;
        }
        case 2: {
          new Login().checkCredentials();
          break;
        }
        case 3: {
          System.out.println("Thank you");
          break;
        }
        default: {
          System.out.println("Inalid input\n");
        }
      }
    }
  }
}

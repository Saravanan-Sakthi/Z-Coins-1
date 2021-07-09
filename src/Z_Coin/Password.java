package Z_Coin;
import java.util.Scanner;
public class Password{
  static Scanner s= Input.s;
  void createpassword( UserID u){ // This method is used for creating new password that match the requirements.
    System.out.println("Create a new Password\n ");
    System.out.println("Password shoud not be user name or part of Email ID or mobile number");
    System.out.println("Should contain atleast 8 characters");
    System.out.println("Should contain mixed case characters");
    String pass=s.nextLine();
    if (checkpass(pass,u)) u.password= pass;
    else createpassword(u);
  }
  boolean checkpass(String pass,UserID u){
    if (pass.contains(u.name) ||u.name.contains(pass)|| pass.contains(u.mobile)|| u.mobile.contains(pass)||u.email.contains(pass) || pass.length()<8){
      System.out.println("Password do not match the requirements, create new password ");
      return false;
    }
    else return true;
  }
}

package Z_Coin;
import java.util.*;
public class UserID{ // This class has the user details and separate objects can be created fo each User
  static HashMap<String,UserID> users = new HashMap<>();
  static HashMap<String,UserID> requests = new HashMap<>();
  static HashMap<Integer,String> IDUsers = new HashMap<>();
  static int zid=1;
  String name="";
  String email="";
  String mobile="";
  boolean ze= false;
  String H_ID="";
  String password="";
  double RC=0;
  double ZC=0;
  int Z_ID;
  ArrayList <Transactions> zctransactions= new ArrayList<>();
  ArrayList <Transactions> rctransactions= new ArrayList<>();
}

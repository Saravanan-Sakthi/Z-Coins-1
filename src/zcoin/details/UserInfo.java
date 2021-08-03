package zcoin.details;
import zcoin.transactions.Transactions;

import java.util.*;
public class UserInfo { // This class has the user details and separate objects can be created fo each User
  static HashMap<String, UserInfo> users = new HashMap<>();
  static HashMap<String, UserInfo> requests = new HashMap<>();
  static HashMap<Integer,String> IDUsers = new HashMap<>();
  public static int zid=1;
  private String name="";
  private String email="";
  private String mobile="";
  private boolean ze= false;
  private String H_ID="";
  private String password="";
  private double RC=0;
  private double ZC=0;
  private int Z_ID;
  private ArrayList <Transactions> zctransactions= new ArrayList<>();
  private ArrayList <Transactions> rctransactions= new ArrayList<>();
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }
  public void setEmail(String email){
    this.email=email;
  }
  public String getEmail(){
    return this.email;
  }
  public void setMobile(String mobile){
    this.mobile=mobile;
  }
  public String getMobile(){
    return this.mobile;
  }
  public void setPassword(String password){
    this.password=password;
  }
  public String getPassword(){
    return this.password;
  }
  public void setZe(boolean ze){
    this.ze=ze;
  }
  public boolean getZe(){
    return this.ze;
  }
  public void setHID(String H_ID){
    this.H_ID=H_ID;
  }
  public String getHID(){
    return this.H_ID;
  }
  public void setRC(double RC){
    this.RC=RC;
  }
  public double getRC(){
    return this.RC;
  }
  public void setZC(double ZC){
    this.ZC=ZC;
  }
  public double getZC(){
    return this.ZC;
  }
  public void setZID(int Z_ID){
    this.Z_ID=Z_ID;
  }
  public int getZID(){
    return this.Z_ID;
  }
}

package zcoin.details;

import java.util.HashMap;

public class Record {
    private static Record record= null;
    private Record(){}
    public static Record getInstance(){
        if (record==null){
            record= new Record();
        }
        return record;
    }
    private HashMap<String, UserInfo> users = new HashMap<>();
    private HashMap<String, UserInfo> requests = new HashMap<>();
    private HashMap<Integer,String> emails = new HashMap<>();
    public void addRequest(UserInfo info){
        requests.put(info.getEmail(),info);
    }
    public void addUsers(UserInfo info){
        users.put(info.getEmail(),info);
        emails.put(info.getZID(),info.getEmail());
    }
    public HashMap getUsers(){
        return this.users;
    }
}

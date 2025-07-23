/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;

class user implements Serializable {

    String fristname;
    String lastname;
    String username;
    String password;
    String confrimpassword;

    public user(String fristname, String lastname, String username, String password, String confrimpassword) {
        this.fristname = fristname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.confrimpassword = confrimpassword;
    }

    user(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return fristname + "\t  " + lastname + "\t   "    + username + "\t  " + password ;
    }

//    Object username() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    

   

}

public class Registration {

    File file = new File("user.txt");
    ArrayList<user> a = new ArrayList<user>();
    ObjectOutputStream oos = null;
    ObjectInputStream osi = null;
    ListIterator li = null;

    public void registration() {
        if (file.isFile()) {
            try {
                osi = new ObjectInputStream(new FileInputStream(file));
                a = (ArrayList<user>) osi.readObject();
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {

    }
}

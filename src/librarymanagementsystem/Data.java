/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;

class memeber implements Serializable {

    String bookid;
    String booktitle;
    String author;
    String publisher;
    String yearofpublication;
    String isbn;
    String noofcopies;

    public memeber(String bookid, String booktitle, String author, String publisher, String yearofpublication, String isbn, String noofcopies) {
        this.bookid = bookid;
        this.booktitle = booktitle;
        this.author = author;
        this.publisher = publisher;
        this.yearofpublication = yearofpublication;
        this.isbn = isbn;
        this.noofcopies = noofcopies;
    }

    
    @Override
    public String toString() {
        return bookid + "\t" + booktitle + "\t     " + author + "\t" + publisher + "\t" + yearofpublication + "\t\t" + isbn + "\t        " + noofcopies;
    }

}

public class Data {

    File file = new File("data.txt");
    ArrayList<memeber> a = new ArrayList<memeber>();
    ObjectOutputStream oos = null;
    ObjectInputStream osi = null;
    ListIterator li = null;

    

    public void data() {
        if (file.isFile()) {
            try {
                osi = new ObjectInputStream(new FileInputStream(file));
                a = (ArrayList<memeber>) osi.readObject();
                osi.close();
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {

    }
}

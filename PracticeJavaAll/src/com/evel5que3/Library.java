package com.evel5que3;
import java.util.HashSet;
import java.util.Set;

public class Library {
   private int bookId;
   private String bookName;
   private String author;

   public Library(){

   }

    public Library(int bookId, String bookName, String author) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int hashCode(){
       return bookId;
    }





    @Override
    public String toString() {
        return "Library{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<Library> library = new HashSet<>();

        library.add(new Library(1,"Name1","Author1"));
        library.add(new Library(2,"Name2","Author2"));
        library.add(new Library(3,"Name3","Author3"));
        library.add(new Library(1,"Name1","Author1"));
        library.add(new Library(4,"Name1","Author1"));


        for(Library l:library){
            System.out.println(l);
        }


    }
}

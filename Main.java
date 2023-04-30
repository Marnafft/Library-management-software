package com.marnaf.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Ainaf library management software");
        Scanner input = new Scanner(System.in);

        String username = "Ainaf";
        String password = "AIU@a";
        

        String a = "Enter your password";
        String b = "Search book";
        String c = "denied";

        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("Enter username");
            String usn = input.nextLine();
            System.out.println("Enter password");
            String pwd = input.nextLine();

            if (usn.equals(username) && pwd.equals(password)) {
                Student student = new Student("Maryam Ibrahim", "12345", "Bala Abdullahi Collage of Remidian studies");
                Library library = new Library("334567","20","100","100");
                Book book = new Book("imaginary world","Ainaf", "235","12345678910");
               
                System.out.println("Student name:" + student.getName());
                System.out.println("Student id:" + student.getId());
                System.out.println("Student college:" + student.getCollege());
                System.out.println("library books:" + library.getBooks());
                System.out.println("library shelves:" + library.getShelves());
                System.out.println("library columns:" + library.getColumns());
                System.out.println("library row:" + library.getRow());

                while (true) {
                    System.out.println("1:Search book");
                    System.out.println("2:Return book");
                    System.out.println("3: borrow book");

                    String choice = input.nextLine();

                    if (choice.equalsIgnoreCase("1")) {
                        // handle book search logic
                        System.out.println("You are searching a book");

                    } else if (choice.equalsIgnoreCase("2")) {
                        // handle book borrow logic
                        System.out.println("You are borrowing a book");

                    } else if (choice.equalsIgnoreCase("3")) {
                        // handle book returning logic
                        System.out.println("You are returning a book");
                    } else {
                        System.out.println("Invalid input. Please try again.");
                        continue;
                    }

                    System.out.println("Do you want to perform another action? (Y/N)");

                    String answer = input.nextLine();
                    if (answer.equalsIgnoreCase("N")) {
                        continueLoop = false;
                        break;
                    }
                }

            }
        }
    }
}

class Student {
    private String name;
    private String id;
    private String college;

    public Student(String name, String id, String college) {
        this.name = name;
        this.id = id;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
        
        System.out.println();
    }
}
 

 
 
class Library{
    private String books;
    private String shelves;
    private String columns;
    private String row;

    public Library(String books, String shelves, String columns, String row){
  
     this.books = books;
     this.shelves = shelves;
     this.columns = columns;
     this.row = row;
  }
  
   public String getBooks(){
    return books;
  }
  
   public void setBooks(String books){
    this.books = books;
  }
   
   public String getShelves(){
     return shelves;
   }
    
   public void setShelves(String shelves){
     this.shelves = shelves;
   }
   
   public String getColumns(){
     return columns;
   }
   
   public void setColumns(String columns){
     this.columns = columns;
   }
    
   public String getRow(){
     return row;
   }
   
   public void setRow(String row){
     this.row = row;
     }
   }

  class Book {
    private String name;
    private String author;
    private int pages;
    private String isbn;
    

    public Book(String name, String author, int page, String isbn) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
   
    }
}

   
  
package Challenges;

public class Book {

    static  int noOfTotalBooks;
    String author ;

    String title;

    String isbn;

    boolean isBorrow;

    static {
        noOfTotalBooks = 0;
    }
    {
        noOfTotalBooks++;
    }

    Book(String isbn,String author, String title){
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }
    Book(String isbn){
        this(isbn , "unknown" , "Unknown");

    }

    static int getNoOfTotalBooks(){
        return noOfTotalBooks;
    }

    void borrowed(){
        if (isBorrow){
            System.out.println("Sorry this Book is Already Borrowed ");
        }
        else {
            this.isBorrow = true;
            System.out.println("enjoy " + this.title + " Book");
        }
    }

    void isReturn(){
        if (isBorrow){
            this.isBorrow = false;
            System.out.println("Hope you Enjoyed , please Give Some Feedback  ");
        }
        else {
            System.out.println("this book is Already in a library ");
        }
    }


    public static void main(String[] args) {
        Book myBook = new Book("1", "The Tread Room" , "Treading ");
        Book newBook  = new Book("2");
        System.out.println(Book.getNoOfTotalBooks());
        myBook.borrowed();
        newBook.borrowed();
        myBook.borrowed();
        myBook.isReturn();
        myBook.isReturn();



    }

}


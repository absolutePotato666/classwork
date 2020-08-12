package bookstoreSystem;

public class Book {
    String bookTitle;
    String bookAuthor;
    String bookISBN;
    int numOfCopies;

    public Book(String bookTitle,String bookAuthor,String bookISBN,int numOfCopies)
    {
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.bookISBN=bookISBN;
        this.numOfCopies=numOfCopies;
    }
    void display()
    {
        System.out.printf("Title: %s \n Author: %s \n ISBN: %s \n Quantity: %d\n",bookTitle,bookAuthor,bookISBN,numOfCopies);
    }

}

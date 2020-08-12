package bookstoreSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
    Scanner scr= new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();

    void sell(String title,int sellingNo)
    {
        for(int i=0;i<books.size();i++)
        {
            if(books.get(i).bookTitle.equals(title) && books.get(i).numOfCopies>sellingNo)
                books.get(i).numOfCopies-=sellingNo;
            else{
                if(books.get(i).numOfCopies<sellingNo)(System.out.println("Not enough copies left");
                else System.out.println("Out of stock");
            }
        }
    }

    void order(String isbn, int orderAmount)
    {
        int int i,f=0;
        for( i=0;i<books.size();i++)
        {
            if(books.get(i).bookISBN.equals(isbn)) {
                f++;
                break;
            }
        }
        if (f==0)
        {
            System.out.println("Title:");
            scr.nextLine();
            String title=scr.nextLine();
            System.out.println("Author:");
            String author=scr.nextLine();
            Book b=new Book(title,author,isbn,orderAmount);
            books.add(b);
        }
        else books.get(i).numOfCopies+=orderAmount;
    }

    void display()
    {
        for(int  i=0;i<books.size();i++)
        {
            books.get(i).display();
        }

    }
}

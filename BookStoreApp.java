package bookstoreSystem;
import java.util.Scanner;

public class BookStoreApp {
    public static void main(String args[])
    {
        Scanner scr= new Scanner(System.in);
        BookStore bs= new BookStore();
        int input=1;
        while(input!=0)
        {
            System.out.println("Select 1 for displaying books");
            System.out.println("Select 2 for ordering books");
            System.out.println("Select 3 for selling books");
            System.out.println("Select 0 to exit");
            input=scr.nextInt();

            if(input==1)
            {
                bs.display();
            }
            if (input==2)
            {
                String isbn= scr.nextLine();
                scr.nextLine();
                int amount=scr.nextInt();
                bs.order(isbn,amount);
            }
            if(input==3)
            {
                String title=scr.nextLine();
                scr.nextLine();
                int amount=scr.nextInt();
                bs.sell(title,amount);
            }
        }

    }
}

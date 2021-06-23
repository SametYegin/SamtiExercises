package SetBook;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>(new OrderNameComparator());

        books.add(new Book("Harry Potter" , 150 , "Rowling" , "1997" ));
        books.add(new Book("Sefiller" , 90 , "Victor Hugo" , "1976" ));
        books.add(new Book("Martı" , 200 , "???" , "1895" ));
        books.add(new Book("Buyuk Umutlar" , 100 , "C. Dickens" , "2005" ));
        books.add(new Book("Don Kişot" , 150 , "Carvantes" , "2002" ));

        for (Book book : books){
            System.out.println(book.getBookName());
        }

        System.out.println("-------------------------");

        TreeSet<Book> newbooks = new TreeSet<>(new OrderPageNumberComparator());

        newbooks.add(new Book("Harry Potter" , 150 , "Rowling" , "1997" ));
        newbooks.add(new Book("Sefiller" , 90 , "Victor Hugo" , "1976" ));
        newbooks.add(new Book("Martı" , 200 , "???" , "1895" ));
        newbooks.add(new Book("Buyuk Umutlar" , 100 , "C. Dickens" , "2005" ));
        newbooks.add(new Book("Don Kişot" , 160 , "Carvantes" , "2002" ));
        //(bunu araştır) sayfa sayısı aynı olan kitaplarda sonradan ekleneni elediğini farkettim.

        for (Book book : newbooks){
            System.out.println(book.getBookName());
        }


    }
}

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Dune",712,"Frank Herbert","Ağustos 1965");
        Book book2 = new Book("Suç ve Ceza",705,"Fyodor Dostoyevski","1866");
        Book book3 = new Book("Sefiller",1724,"Victor Hugo","1862");
        Book book4 = new Book("Bir İdam Mahkumunun Son Günü",100,"Victor Hugo","Şubat 1829");
        Book book5 = new Book("1984",250,"George Orwell","8 Haziran 1949");
        TreeSet<Book> books = new TreeSet<>(new OrderByNameComparator());
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println("--------------- Alfabetik Sıra ---------------");
        System.out.println();

        for (Book b : books){
            System.out.println(b);
        }

        System.out.println();
        System.out.println("--------------- Sayfa Sayısına Göre Sıra ---------------");
        System.out.println();

        TreeSet<Book> books2 = new TreeSet<>(new OrderByPagesComparator());
        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);
        books2.add(book5);

        Iterator<Book> itr = books2.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

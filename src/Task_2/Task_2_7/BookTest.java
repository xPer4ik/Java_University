package Task_2.Task_2_7;

public class BookTest {

    public static void main(String [] args){
        BookShelf books = new BookShelf();
        books.addBook("Bob Green", "Algorithm", 2011);
        books.addBook("Tommy", "Phones", 1991);
        System.out.println(books.getBook(0).toString());
        System.out.println("Author: "+ books.getBook(0).getAuthor() + " Name: "
                + books.getBook(0).getName() + " DateOfCreation: " + books.getBook(0).getDateOfCreation());
        books.getBook(0).setAuthor("Tom Grey");
        books.getBook(0).setName("New world");
        books.getBook(0).setDateOfCreation(2022);
        System.out.println("UpdatedAuthor: "+ books.getBook(0).getAuthor() + " Name: "
                + books.getBook(0).getName() + " DateOfCreation: " + books.getBook(0).getDateOfCreation());
        System.out.println(books.getBook(1).toString());
        System.out.println(books.theNewest().toString());
        System.out.println(books.theOldest().toString());
    }
}

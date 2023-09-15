package Task_2.Task_2_7;

import java.util.ArrayList;

public class BookShelf {
    private final ArrayList<Book> books = new ArrayList<>();
    private int numberOfBooks = 0;


    public BookShelf(){

    }
    public void addBook(String author, String name, int dateOfCreation){ // добавить книгу в книжную полку
        Book book = new Book(author,name,dateOfCreation);
        this.books.add(book);
        numberOfBooks++;
    }
    public Book getBook(int number){
        return books.get(number);
    } // "взять" книгу
    public Book theOldest(){ // вывести книгу с самым старым
        Book theOldest = books.get(0);
        for(Book book:books){
            if(theOldest.getDateOfCreation() > book.getDateOfCreation()){
                theOldest = book;

            }
        }
        return theOldest;
    }
    public Book theNewest() { // вывести книгу с самым новым изданием
        Book theNewest = books.get(0);
        for (Book book : books) {
            if (theNewest.getDateOfCreation() < book.getDateOfCreation()) {
                theNewest = book;
            }
        }
        return theNewest;
    }
    public void sortInOrder(){ // отсортировать книги по изданию в порядке возрастания
        for(int i = 0; i <this.numberOfBooks;i++){
            for(int j = i+1;j < this.numberOfBooks;j++){
                if(this.books.get(j).getDateOfCreation() < this.books.get(i).getDateOfCreation()){
                    Book w = this.books.get(j);
                    this.books.set(j,this.books.get(i));
                    this.books.set(i,w);


                }
            }
        }
    }
}

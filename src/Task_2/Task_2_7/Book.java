package Task_2.Task_2_7;


public class Book {
    private String author;
    private String name;
    private int dateOfCreation;

    public Book(String author, String name, int dateOfCreation){ // конструктор книги
        this.author = author;
        this.name = name;
        this.dateOfCreation = dateOfCreation;
    }

    public String getAuthor() {
        return author;
    } // получить имя автора
    public String getName() {
        return name;
    } //  получить название книги
    public int getDateOfCreation() {
        return dateOfCreation;
    } // получить дату издания
    public void setAuthor(String author) {
        this.author = author;
    } // установить имя автора
    public void setName(String name) {
        this.name = name;
    } // установить название книги
    // устрановить дату издания
    public void setDateOfCreation(int dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
    // вывести  информацию о книге
    public String toString(){
        return "Author: "+ author + " Name: " + name + " DateOfCreation: " + dateOfCreation;
    }
}

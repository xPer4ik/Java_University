package Task_2.Task_2_7;


public class Book {
    private String author;
    private String name;
    private int dateOfCreation;

    public Book(String author, String name, int dateOfCreation){
        this.author = author;
        this.name = name;
        this.dateOfCreation = dateOfCreation;
    }

    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public int getDateOfCreation() {
        return dateOfCreation;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDateOfCreation(int dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String toString(){
        return "Author: "+ author + " Name: " + name + " DateOfCreation: " + dateOfCreation;
    }
}

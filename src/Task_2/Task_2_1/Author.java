package Task_2.Task_2_1;

public class Author { // класс автор
    private String name;
    private  String  email;
    private char gender;
    public Author(String name,String email, char gender){ // конструктор
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String  getName(){ // получить имя
        return this.name;
    }
    public String getEmail(){ // получить email
        return this.email;
    }
    public void setEmail(String email){ // изменить или установить email
        this.email = email;
    }
    public char getGender(){ // получить пол
        return this.gender;
    }
    public String toString(){ // вывод информации об авторе
        return "Author{" + "name=" + this.name + ", email=" + this.email + ", gender=" + this.gender + "}";
    }

}

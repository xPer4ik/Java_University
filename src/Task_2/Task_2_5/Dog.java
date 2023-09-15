package Task_2.Task_2_5;

public class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname, int age){ // конструктор собаки
        this.nickname = nickname;
        this.age = age;
    }
    public int getAge() {
        return age;
    } // получить возраст собаки
    public String getNickname(){
        return nickname;
    } // получить кличку собаки
    public void setAge(int age) {
        this.age = age;
    } // установить возраст собаки
    public void setNickname(String nickname) {
        this.nickname = nickname;
    } // установить кличку собаки
    public int ageToHuman(){
        return this.age * 7;
    } // получить возраст собаки по человеческим меркам
    public String toString() {
        return "nickname:"+ nickname + "\nage:" + age;
    } // вывести инфо собаки
}

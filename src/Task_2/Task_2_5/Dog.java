package Task_2.Task_2_5;

public class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname, int age){
        this.nickname = nickname;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getNickname(){
        return nickname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int ageToHuman(){
        return this.age * 7;
    }
    public String toString() {
        return "nickname:"+ nickname + "\nage:" + age;
    }
}

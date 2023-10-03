package Task_4.Task_4_1;

import java.sql.SQLOutput;

public class Years{
    enum Year {
        Spring(12),
        Summer(30){
            @Override
            public String getDescription() {
                if (this == Summer) {
                    return "Теплое время года";
                }
                return "Холодное время года}";
            }
        },
        Autumn(11),
        Winter(-20);
        private int temp;

        Year( int temp) {
            this.temp = temp;
        }

        public void setTemp(int tempp){
            this.temp = tempp;
        }
        public String getDescription() {
            return "Холодное время года}";
        }



    }

    public static void favoriteYear(Year year){
        switch (year){
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Autumn:
                System.out.println("Я люблю осень");
                break;
            case Spring:
                System.out.println("Я люблю весну");
                break;
            case Winter:
                System.out.println("Я люблю зиму");
                break;
        }
    }

    public static void main(String [] args){
        Year favorite = Year.Autumn;
        System.out.println("Мое любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.temp);
        favoriteYear(favorite);
    }
}


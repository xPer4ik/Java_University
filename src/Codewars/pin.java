package Codewars;

public class pin {
        public static boolean validatePin(String pin) {
            if(pin.length() == 4 || pin.length() == 6) {
                return pin.matches("[0-9]+");
            }




            return false;
        }

    public static void main(String[] args) {
        System.out.println(validatePin("1234a1"));
    }
}

package projects;

public class pucci {

    public static int primesTo = 1000;
    public static void main(String[] args) {
        for (int i = 2; i <= primesTo; i++) {
            if (isPrimeBrute(i)){System.out.println(i);}
        }
    }

    public static boolean isPrimeBrute(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0){return false;}
        }
        return true;
    }
}

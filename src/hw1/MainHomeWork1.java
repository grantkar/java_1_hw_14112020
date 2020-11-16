package hw1;

public class MainHomeWork1 {
    public static void main(String[] args) {
        /*  byte a = 5;
        int b = 555555555;
        long c = 555555555555L;
        float d = 15.15f;
        double r = 1555.1555;
        char ch = '$';
        boolean log = true;
        string myString = "Hello Java"*/
        // float a = 12.5f;
        //  float b = 10.1f;
        //  float c = 10.2f;
        // float d = 5.1f;
        System.out.println(calc(1.5f, 1.1f, 1.2f, 1.1f));
        System.out.println(chapel(10, 5));
        minusOfPlus(5);
        System.out.println(negative(-5));
        greeting("Грант");
        leapYear(2405);
    }

    public static float calc(float a,float b,float c,float d) {
        return a * (b + (c / d));
    }
    public static boolean chapel(int a, int b){
        return (a + b)>=10 && (a + b)<= 20;
    }
    public static void minusOfPlus(int a){
        if (a>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean negative(int a){
        return a<0;
    }
    public static void greeting(String s){
        System.out.println("Привет " + s);
    }
    public static void leapYear(int y){
        if ( y%4 == 0 && (y%100!=0 || y%400 ==0)){
            System.out.println("Год Высокостный!");
        } else {
            System.out.println("Год не является Высокостным!");
        }
    }
}

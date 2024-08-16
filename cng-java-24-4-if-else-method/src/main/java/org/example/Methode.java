package org.example;

public class Methode {
    public static void main(String[] args){
        int result = addNumber(5,10);
        double result2 = addNumber(10.0, 11.0);
        System.out.println("Result:"+result);
        System.out.println("Result:"+result2);

        int ergebnis= subtract(5, 6);
        System.out.println("Result:"+ergebnis);

        int num = 4;
        int  result3 = Methode.isEven(num);
        System.out.println(num + " is even: " + result3);  // Ausgabe: 4 is even: true

        num = 7;
        result3 = Methode.isEven(num);
        System.out.println(num + " is even: " + result3);  // Ausgabe: 7 is even: false
        System.out.println(isPalindrome("racecar"));  // true
        System.out.println(makePositive(-25));
    }
    public static int addNumber(int a, int b){
        int sum = a+b;
        return sum;
    }
    // method überschreiben
    public  static double addNumber(double a, double b) {
        return a + b;
    }

    // Subtraction methods
    public static int subtract(int a, int b) {
        if(a>b){
            return a-b;

        }else{
            return a+b;
        }
        //return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }
    public static int isEven(int a){
        if(a%2==0){
            return a;
        }else{
            return 2*a;
        }

    }

    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare characters from start and end
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    //makepositive
    public static int makePositive(int number) {
        return number < 0 ? -number : number;
    }
}

import java.util.Scanner;

public class pra2 {
    public static class Tester{
        String findEvenOdd(int a){
            if(a % 2 == 0) {
                return "Even(짝수)"; // 짝수면 0 반환
            } else {
                return "Odd(홀수)"; // 홀수면 1 반환
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String result = "";
        int input = scan.nextInt();
        Tester Finder = new Tester();

        result = Finder.findEvenOdd(input);

        System.out.println(input + " is " + result);
    }






}


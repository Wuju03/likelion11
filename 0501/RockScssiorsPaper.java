import java.util.Scanner;

public class RockScssiorsPaper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Man, Woman;

        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 >>");

        Man = scan.nextLine();

        System.out.print("영희 >> ");
        Woman = scan.nextLine();

        if((Man.equals("가위") && Woman.equals("보")) || (Man.equals("바위") && Woman.equals("보")) || (Man.equals("보") && Woman.equals("바위"))){
            System.out.println("철수가 이겼습니다");
        } else if(Man.equals(Woman)){
            System.out.println("영희가 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }

        scan.close();
    }
}


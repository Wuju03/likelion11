import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
        int[] height = new int[5];
        int sum = 0;
        double average = 0;

        Scanner scan = new Scanner(System.in);
        for(int i=0;i<=4;i++){
            System.out.printf("%s의 신장을 입력하세요 : ", name[i]);
            height[i] = scan.nextInt();
            sum += height[i]; // 키 합계내기
        }
        scan.close();

        for(int p=0;p<=4;p++){
            System.out.printf("%s의 키는 %d입니다.\n", name[p], height[p]);
        }
        average = sum / 5;
        System.out.printf("신장의 합계 : %d\n", sum);
        System.out.printf("평균 신장 : %.2f\n", average);

    }
}

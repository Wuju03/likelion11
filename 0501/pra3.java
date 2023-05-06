import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class pra3 {

    public static class Rectangle{
        static int area(int width, int height){
            return width * height;
        }

    }
    public static void main(String[] args) {

        int result = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.\n");
        int width = scan.nextInt();
        int height = scan.nextInt();
        /*
        Rectangle Tester = new Rectangle();

        result = Tester.area(width, height);
        */

        result = Rectangle.area(width, height);
        System.out.println(result);


    }
}

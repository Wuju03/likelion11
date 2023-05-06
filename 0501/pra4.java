/*
import java.util.Scanner;

public class pra4 {
    public static class Animal{
        String Species = "", Name = "", Age = "";

        void makeSound(String Species){
            if(Species == "강아지"){
                System.out.println("야옹");
            } else if(Species == "고양이"){
                System.out.print("멍멍");
            }
        }

    }

    public class Cat extends Animal{

    }

    public class Dog extends Animal{

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Species = "", Name = "", Age = "";

        System.out.println("동물의 종을 입력하세요");
        Species = scan.nextLine();

        if(Species == "고양이"){

        }
    }
}

 */
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class pra4 {
    public static class Animal{
        String Species = "", Name = "", Age = "";

        static void makeSound(){

            System.out.println("동물은 소리를 낸다");

            /*
            if(Species == "강아지"){
                System.out.println("야옹");
            } else if(Species == "고양이"){
                System.out.print("멍멍");
            }
            */
        }

    }

    public static class Cat extends Animal{
        static void makeSound(){
            System.out.println("야옹");
        }

    }

    public static class Dog extends Animal{
        static void makeSound(){
            System.out.println("멍멍");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Species = "", Name = "";
        int Age;

        System.out.println("동물의 종, 이름, 나이를 순서대로 입력하세요");

        Species = scan.next();
        Name = scan.next();
        Age = scan.nextInt();
        scan.close();

        System.out.println(Species);

        /*
        System.out.println("*해당 동물의 정보*");
        System.out.println("종 : " + Species);
        System.out.println("이름 : " + Name);
        System.out.println("나이 : " + Age);
        */
        if(Species.equals("강아지")){
            Dog.makeSound();
        } else if(Species.equals("고양이")){
            Cat.makeSound();
        }



    }
}

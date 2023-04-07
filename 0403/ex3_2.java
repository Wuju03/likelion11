public class ex3_2 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;
        while(i<=100){
            sum += i;
            i++;
        }
        System.out.printf("1~100까지의 합 : %d", sum);
    }
}

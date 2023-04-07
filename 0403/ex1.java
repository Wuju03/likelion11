public class ex1 {
    public static void main(String[] args) {
        double Korean = 92, English = 80, Math = 96;
        double d_sum = Korean + English + Math;
        double d_avg = d_sum / 3;
        int avg = (int) d_avg;
        System.out.printf("평균점수(실수형) : %f\n", d_avg);
        System.out.printf("평균점수(정수형) : %d\n", avg);
    }
}

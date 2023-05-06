/*
정수 배열 이용 -> 평균 값 구해서 리턴
메서드 명은 avg
길이는 length로 확인
 */
public class pra1 {
    public static class Calculator{
        int avg(int[] data){

            int sum = 0;
            for(int i = 0; i<data.length; i++){
                sum += data[i];
            }

            return sum / data.length;
        }

    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int[] data = {1, 3, 5, 7, 9, 11};
        int result = cal.avg(data);

        System.out.println("avg : " + result);
    }
}

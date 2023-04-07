public class ex2 {
    public static void main(String[] args) {
        char op = '+';
        double sum = 0;
        double x = 169, y = 4;
        /*
        if(op == '+'){
            sum = x + y;
        } else if(op == '-'){
            sum = x - y;
        } else if(op =='*'){
            sum = x * y;
        } else if(op =='%'){
            sum = x % y;
        } else if (op == '/') {
            sum = x / y;
        }
         */
        switch (op){
            case '+':{
                sum = x + y;
            }
            case '-':{
                sum = x - y;
            }
            case '*':{
                sum = x * y;
            }
            case '%':{
                sum = x % y;
            }
            case '/':{
                sum = x / y;
            }

        }


        System.out.printf("169 %c 4 = %.2f", op, sum);
    }
}
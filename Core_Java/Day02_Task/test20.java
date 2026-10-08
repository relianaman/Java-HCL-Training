package Day02_Task;

public class test20 {
    public static void main(String[] args) {
        for(int number=1; number<=1000; number++) {
            int res = 0;
            int temp = number;
            int digits = 0;

            while(temp > 0) {
                temp = temp/10;
                digits = digits + 1;
            }

            temp = number;

            while(temp > 0) {
                int digit = temp%10;
                int power = 1;

                for (int i = 0; i < digits; i++) {
                    power = power * digit;
                }

                res = res + power;
                temp = temp/10;
            }

            if(number == res)
                System.out.println(number);
        }
    }
}

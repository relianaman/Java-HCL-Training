package Day02_Task;

public class test16 {
    public static void main(String[] args) {
        for(int number=1; number<=100; number++) {
            int count = 0;
            for(int i=1; i<=number; i++) {
                if(number%i == 0)
                    count++;
            }
            if(count == 2) 
                System.out.println(number);
        }
    }
}

public class test13 {
    public static void main(String[] args) {
        int n = 1;
        while(n <= 5) {
            if(n == 3) {
                System.out.println("Skip: " + n);
                n++;
                continue;
            }
            System.out.println("Number: " + n);
            n++;
        }
    }
}

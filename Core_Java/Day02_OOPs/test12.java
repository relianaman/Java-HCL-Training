public class test12 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            if(i == 5) {
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }

        System.out.println("-------------------------");

        for(int i=1; i<=10; i++) {
            if(i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}

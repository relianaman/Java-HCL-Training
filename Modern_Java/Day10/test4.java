interface myCompare {
    public void com(int a, int b);
}

public class test4 {
    public static void main(String[] args) {
        myCompare obj = (a, b) -> {
            if(a > b)   
                System.out.println(a);
            else
                System.out.println(b);
        };
        obj.com(10, 20);
    }
}

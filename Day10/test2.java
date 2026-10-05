interface nameHCL {
    public void name(String name);
}

public class test2 {
    public static void main(String[] args) {
        nameHCL obj = (name) -> System.out.println(name);
        obj.name("Naman");
    }
}

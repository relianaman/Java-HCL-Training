import java.util.Optional;

public class test1 {
    public static void main(String[] args) {

        // Optional.of -> value must return not null
        // with wrapper class
        Optional<String> obj1 = Optional.of("Naman");
        System.out.println(obj1);


        // ifPresent() -> executes action if values exists
        // without wrapper class
        obj1.ifPresent(System.out::println);


        // Optional.ofNullable -> allows null
        Optional<String> obj2 = Optional.ofNullable(null);
        System.out.println(obj2); // value == null


        // Get() -> value retirival
        Optional<String> obj3 = Optional.of("Raj");
        System.out.println(obj3.get());


        // Empty Optional
        Optional<String> obj4 = Optional.ofNullable(null);
        System.out.println(obj4.isPresent());  // false


        // with value
        Optional<String> obj5 = Optional.ofNullable("Naman");
        System.out.println(obj5.isPresent());  // true


        // orElse -. provides a default value
        Optional<String> obj6 = Optional.ofNullable(null);
        System.out.println(obj6.orElse("Hello"));

    }
}
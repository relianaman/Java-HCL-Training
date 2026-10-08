package Day13;

import java.util.Optional;

public class test3 {
    public static void main(String[] args) {
        
        Optional<User> user = getUser();

        user.map(x -> x.address)
            .map(y -> y.city)
            .ifPresent(System.out::println);
        
    }

    private static Optional<User> getUser() {
        Address a = new Address();
        a.city = "Jaipur";

        User u =new User();
        u.address = a;
        return Optional.of(u);
    }

    static class User {
        public Address address;

    }

    static class Address {
        public String city;
    }
}

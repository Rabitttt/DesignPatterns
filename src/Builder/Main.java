package Builder;

public class Main {
    public static void main(String[] args) {
        //Builder is a creational design pattern that lets you construct complex objects step by step.
        //Causes a slight memory issue. But code readability is much more important than this.
        //This example have Builder Pattern without Singleton pattern.
        User user = new User.UserBuilder()
                .id(10)
                .name("selman")
                .age(23)
                .role("Backend Developer")
                .build();

        System.out.println(user);
    }
}

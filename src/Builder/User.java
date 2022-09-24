package Builder;

public class User {
    private int id;
    private String name;
    private int age;
    private String role;

    // Builder code
    public User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.role = userBuilder.role;
    }

    public static class UserBuilder {
        private int id;
        private String name;
        private int age;
        private String role;

        public UserBuilder id(int id) {
            this.id = id;
            return this;
        }
        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder role(String role) {
            this.role = role;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


    //Boilerplate setters, getters and toString
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}

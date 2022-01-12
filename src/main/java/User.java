public class User {
    private String username;
    private String email;
    private String password;
    private int age;

    public User() {
    }

    public User(String username, String email, String password, int age) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

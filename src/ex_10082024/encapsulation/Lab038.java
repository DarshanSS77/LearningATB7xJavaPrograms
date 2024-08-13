package ex_10082024.encapsulation;

public class Lab037 {
    public static void main(String[] args) {
        login l = new login("admin1", "pass123");
        System.out.println(l.username);
        System.out.println(l.password);
        l.username = "new name";
        System.out.println(l.username);
    }

}

class login {
     String username = "admin";
    String password = "password";


    public login(String name, String pass) {
        this.username = name;
        this.password = pass;
    }
}


